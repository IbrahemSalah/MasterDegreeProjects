package com.example.ibrahemsalah615885assignment3

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ibrahemsalah615885assignment3.databinding.ActivityShopBinding

class ShopActivity : AppCompatActivity() {
    var binding: ActivityShopBinding? = null
    private var miuUser: MIUUser? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        getExtra()
        initViews()
    }

    private fun getExtra() {
        miuUser = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(AuthDB.MIU_USER_EXTRA, MIUUser::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(AuthDB.MIU_USER_EXTRA)
        }
    }

    private fun initViews() {
        val welcomeMsg = getString(R.string.welcome) + miuUser?.userName
        binding?.tvWelcome?.text = welcomeMsg

        binding?.llBooks?.setOnClickListener {
            Toast.makeText(this, "Books Clicked", Toast.LENGTH_SHORT).show()
        }

        binding?.llClothing?.setOnClickListener {
            Toast.makeText(this, "Clothing Clicked", Toast.LENGTH_SHORT).show()
        }

        binding?.llFood?.setOnClickListener {
            Toast.makeText(this, "Food Clicked", Toast.LENGTH_SHORT).show()
        }

        binding?.llMedicines?.setOnClickListener {
            Toast.makeText(this, "Medicines Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}