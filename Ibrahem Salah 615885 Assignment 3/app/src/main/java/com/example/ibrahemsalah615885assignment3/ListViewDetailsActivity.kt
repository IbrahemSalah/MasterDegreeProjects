package com.example.ibrahemsalah615885assignment3

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ibrahemsalah615885assignment3.databinding.ActivityListViewDetailsBinding


class ListViewDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListViewDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        val booksArray = resources.getStringArray(R.array.book_list)
        val adapter: ArrayAdapter<String> =
            ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                booksArray
            )

        binding.lvBooks.adapter = adapter
        binding.lvBooks.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "You clicked on $position th Book", Toast.LENGTH_SHORT).show()
        }
    }
}