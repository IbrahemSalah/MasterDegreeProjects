package com.example.ibrahemsalah615885assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ibrahemsalah615885assignment3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}