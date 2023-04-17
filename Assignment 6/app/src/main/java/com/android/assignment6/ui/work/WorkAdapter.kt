package com.android.assignment6.ui.work

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.assignment6.databinding.WorkFragmentItemBinding
import com.bumptech.glide.Glide

class WorkAdapter(private val context: Context) : RecyclerView.Adapter<WorkAdapter.ViewHolder>() {

    val dataset = WorkDataSource.workList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            WorkFragmentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val workExperience = dataset[position]

        holder.binding.position.text = workExperience.position
        holder.binding.company.text = workExperience.company?.companyName
        holder.binding.duration.text = workExperience.duration
        holder.binding.location.text = workExperience.location

        Glide.with(context)
            .load(workExperience.company?.companyIconUrl)
            .centerCrop()
            .into(holder.binding.icon)

        holder.binding.description.text = workExperience.jobDescirption

    }
     inner class ViewHolder(val binding: WorkFragmentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}