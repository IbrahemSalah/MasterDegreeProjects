package com.android.assignment6.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.assignment6.data.model.WorkExperienceModel
import com.android.assignment6.databinding.WorkExperienceItemBinding

class WorkExperienceAdapter(
    private var dataSet: List<WorkExperienceModel>
) : RecyclerView.Adapter<WorkExperienceAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            WorkExperienceItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val workExperience = dataSet[position]

        val titleFormatted = workExperience.title + ": "

        holder.binding.tvTitle.text = titleFormatted
        holder.binding.tvDesc.text = workExperience.desc
    }

    fun updateDataSet(dataSet: List<WorkExperienceModel>){
        this.dataSet = dataSet
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    inner class ViewHolder(val binding: WorkExperienceItemBinding) :
        RecyclerView.ViewHolder(binding.root)
}