package com.android.assignment6.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.assignment6.databinding.FragmentHomeBinding
import com.android.assignment6.ui.base.BaseViewModelFragment


class HomeFragment : BaseViewModelFragment<HomeViewModel, FragmentHomeBinding>(
    HomeViewModel::class
) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }


}