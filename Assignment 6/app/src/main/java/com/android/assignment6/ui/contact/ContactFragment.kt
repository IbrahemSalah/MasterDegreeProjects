package com.android.assignment6.ui.contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.assignment6.databinding.FragmentContactBinding
import com.android.assignment6.ui.base.BaseViewModelFragment
import com.android.assignment6.ui.home.HomeViewModel

class ContactFragment : BaseViewModelFragment<HomeViewModel, FragmentContactBinding>(
    HomeViewModel::class
) {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentContactBinding.inflate(layoutInflater)
        return binding.root
    }

}