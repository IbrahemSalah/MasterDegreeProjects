package com.android.assignment6.ui.home

import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.android.assignment6.databinding.FragmentHomeBinding
import com.android.assignment6.ui.base.BaseViewModelFragment


class HomeFragment : BaseViewModelFragment<HomeViewModel, FragmentHomeBinding>(
    HomeViewModel::class
) {
    private lateinit var adapter: WorkExperienceAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun initViews() {
        super.initViews()

        adapter = WorkExperienceAdapter(DataSource.getWorkExperienceList())
        binding.rvWorkExperience.adapter = adapter

        binding.fbAddWorkExperience.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToAddWorkExperienceFragment())
        }

    }

    override fun initObservers() {
        super.initObservers()

        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<Boolean>(
            DataSource.WORK_EXPERIENCE_UPDATED
        )?.observe(viewLifecycleOwner) {updated ->
            if(updated){
                updateRecycleViewDataSet()
                findNavController().currentBackStackEntry?.savedStateHandle?.remove<Boolean>(DataSource.WORK_EXPERIENCE_UPDATED)
            }
        }
    }

    private fun updateRecycleViewDataSet(){
        adapter.updateDataSet(DataSource.getWorkExperienceList())
    }
}