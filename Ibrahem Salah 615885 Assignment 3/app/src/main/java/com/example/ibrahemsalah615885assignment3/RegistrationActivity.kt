package com.example.ibrahemsalah615885assignment3

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ibrahemsalah615885assignment3.databinding.ActivityRegistrationBinding


class RegistrationActivity : AppCompatActivity() {
    var binding: ActivityRegistrationBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        initViews()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }
    private fun initViews() {
        binding?.btnSignUp?.setOnClickListener {
            if (binding?.etFirstName?.text.toString().isEmpty() ||
                binding?.etLastName?.text.toString().isEmpty() ||
                binding?.etUsername?.text.toString().isEmpty() ||
                binding?.etPassword?.text.toString().isEmpty()
            ) {

                Toast.makeText(this, "Please fill all data!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val miuUser = MIUUser(
                firstName = binding?.etFirstName?.text.toString(),
                lastName = binding?.etLastName?.text.toString(),
                userName = binding?.etUsername?.text.toString(),
                password = binding?.etPassword?.text.toString()
            )
            setUserIntoDB(miuUser)
            completeSignUp(miuUser)
        }
    }

    private fun setUserIntoDB(miuUser: MIUUser) {
        AuthDB.signUpNewUser(miuUser)
    }

    private fun completeSignUp(user: MIUUser) {
        val intent = Intent()
        intent.putExtra(AuthDB.MIU_USER_EXTRA, user)
        setResult(RESULT_OK, intent)
        finish()
    }
}