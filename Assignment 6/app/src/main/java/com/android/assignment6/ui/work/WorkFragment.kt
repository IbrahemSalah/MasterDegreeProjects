package com.android.assignment6.ui.work

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.assignment6.databinding.FragmentWorkBinding
import com.android.assignment6.ui.base.BaseViewModelFragment
import com.android.assignment6.ui.home.HomeViewModel


class WorkFragment : BaseViewModelFragment<HomeViewModel, FragmentWorkBinding>(
    HomeViewModel::class
) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWorkBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun initViews( ) {
        val workAdapter = WorkAdapter(requireContext())
        binding.workRecyclerView.adapter = workAdapter
        binding.workRecyclerView.layoutManager = LinearLayoutManager(activity)

    }
}