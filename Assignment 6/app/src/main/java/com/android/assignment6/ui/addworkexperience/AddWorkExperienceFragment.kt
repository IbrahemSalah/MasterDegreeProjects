package com.android.assignment6.ui.addworkexperience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.android.assignment6.databinding.FragmentAddWorkExperienceBinding
import com.android.assignment6.ui.base.BaseViewModelFragment
import com.android.assignment6.ui.home.DataSource
import com.android.assignment6.ui.home.HomeViewModel


class AddWorkExperienceFragment :
    BaseViewModelFragment<HomeViewModel, FragmentAddWorkExperienceBinding>(
        HomeViewModel::class
    ) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddWorkExperienceBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initViews() {
        super.initViews()

        binding.btnAdd.setOnClickListener {
            val title = binding.tvTitle.text.toString()
            val desc = binding.tvDesc.text.toString()

            addWorkExperience(title, desc)
        }
    }

    private fun addWorkExperience(title: String, desc: String) {
        DataSource.addWorkExperienceList(title, desc)

        findNavController().previousBackStackEntry
            ?.savedStateHandle
            ?.set(DataSource.WORK_EXPERIENCE_UPDATED, true)
        findNavController().navigateUp()

    }
}