package com.example.ibrahemsalah615885assignment3

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.ibrahemsalah615885assignment3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null

    private var resultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
                fillRegisteredUserDataIntoRegistrationViews(getMIUUserFromExtra(data))
            } else {
                Toast.makeText(this, "User Didn't Sign up", Toast.LENGTH_SHORT).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        initUserDB()
        initViews()
    }

    private fun initUserDB() {
        AuthDB.addDummyListOfUser()
    }

    private fun initViews() {

        binding?.btnSignIn?.setOnClickListener {
            if (binding?.etUsername?.text.toString().isEmpty() ||
                binding?.etPassword?.text.toString().isEmpty()
            ) {
                Toast.makeText(this, "Please fill login data...", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val user = MIUUser(
                userName = binding?.etUsername?.text.toString().trim(),
                password = binding?.etPassword?.text.toString().trim()
            )
            authenticate(user)
        }


        binding?.btnSignUp?.setOnClickListener {
            openSignUpActivityForResult()
        }

        binding?.tvForgetPassword?.setOnClickListener {
            if (binding?.etUsername?.text.toString().trim().isEmpty()) {
                Toast.makeText(this, "Please write email first.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            checkIfUserExists(binding?.etUsername?.text.toString())
        }
    }

    private fun authenticate(user: MIUUser) {
        authResultHandler(AuthDB.signInUser(user), user)
    }

    private fun checkIfUserExists(email: String) {
        if (AuthDB.userNameExists(email)) {
            val password =
                sendForgetPasswordEmail(email, "Reset Your Password")
        } else {
            Toast.makeText(this, "Email doesn't exist", Toast.LENGTH_SHORT).show()
        }
    }

    private fun openSignUpActivityForResult() {
        val intent = Intent(this, RegistrationActivity::class.java)
        resultLauncher.launch(intent)
    }

    private fun fillRegisteredUserDataIntoRegistrationViews(user: MIUUser?) {

        user?.let {
            binding?.etUsername?.setText(it.userName)
            binding?.etPassword?.setText(it.password)
        }
    }

    private fun authResultHandler(result: Boolean, user: MIUUser) {
        if (result) {
            val intent = Intent(this@MainActivity, ShopActivity::class.java)
            intent.putExtra(AuthDB.MIU_USER_EXTRA, user)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Invalid Credentials...", Toast.LENGTH_SHORT).show()
        }
    }

    private fun getMIUUserFromExtra(data: Intent?): MIUUser? {
        val user = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            data?.getParcelableExtra(AuthDB.MIU_USER_EXTRA, MIUUser::class.java)
        } else {
            @Suppress("DEPRECATION")
            data?.getParcelableExtra(AuthDB.MIU_USER_EXTRA) as MIUUser?
        }

        return user
    }

    private fun sendForgetPasswordEmail(email: String, subject: String) {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:")
        intent.putExtra(Intent.EXTRA_EMAIL, email)
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}