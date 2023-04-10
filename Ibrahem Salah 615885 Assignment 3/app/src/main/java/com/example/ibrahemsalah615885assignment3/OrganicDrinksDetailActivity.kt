package com.example.ibrahemsalah615885assignment3

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.ibrahemsalah615885assignment3.databinding.ActivityOrganicDrinksDetailBinding

class OrganicDrinksDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrganicDrinksDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrganicDrinksDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtra()
    }

    private fun getExtra() {
        val product = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(AuthDB.PRODUCT_EXTRA, Product::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(AuthDB.PRODUCT_EXTRA)
        }

        product?.let {
            showProductDetails(product)
        } ?: kotlin.run {
            Toast.makeText(this, "Something went wrong.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showProductDetails(product: Product) {
        binding.tvName.text = product.title
        binding.tvId.text = product.itemId
        binding.tvPrice.text = product.price.toString()
        binding.tvDesc.text = product.desc


        Glide.with(this).load(product.imageUrl).placeholder(R.drawable.ic_miulogo).centerCrop()
            .into(binding.ivCover)

    }
}