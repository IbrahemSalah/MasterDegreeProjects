package com.example.ibrahemsalah615885assignment3

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ibrahemsalah615885assignment3.databinding.OrganicDrinkItemBinding

class OrganicDrinksAdapter(
    private val dataSet: List<Product>, private val context: Context
) : RecyclerView.Adapter<OrganicDrinksAdapter.ViewHolder>() {

    lateinit var onItemClick: (Product) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            OrganicDrinkItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = dataSet[position]

        holder.binding.tvName.text = product.title
        holder.binding.tvPrice.text = product.price.toString()

        Glide.with(context)
            .load(product.imageUrl)
            .placeholder(R.drawable.ic_miulogo)
            .centerCrop()
            .into(holder.binding.ivDrinkCover)

        holder.binding.root.setOnClickListener {
            onItemClick.invoke(product)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    inner class ViewHolder(val binding: OrganicDrinkItemBinding) :
        RecyclerView.ViewHolder(binding.root)
}