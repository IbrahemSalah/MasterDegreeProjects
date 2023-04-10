package com.example.ibrahemsalah615885assignment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ibrahemsalah615885assignment3.databinding.ActivityListViewDetailsBinding
import com.example.ibrahemsalah615885assignment3.databinding.ActivityOrganicDrinksListBinding

class OrganicDrinksListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrganicDrinksListBinding

    private lateinit var adapter: OrganicDrinksAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrganicDrinksListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        AuthDB.addDummyProductList()
        adapter = OrganicDrinksAdapter(AuthDB.getProductList(), this)
        adapter.onItemClick = { openDetailScreen(it) }
        binding.rvOrganicDrinks.adapter = adapter
    }

    private fun openDetailScreen(product: Product) {
        val intent = Intent(this, OrganicDrinksDetailActivity::class.java)
        intent.putExtra(AuthDB.PRODUCT_EXTRA, product)
        startActivity(intent)
    }
}