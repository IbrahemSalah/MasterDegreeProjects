package com.android.assignment6.ui.aboutme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.assignment6.databinding.FragmentAboutMeBinding
import com.android.assignment6.ui.base.BaseViewModelFragment
import com.android.assignment6.ui.home.HomeViewModel

class AboutMeFragment : BaseViewModelFragment<HomeViewModel, FragmentAboutMeBinding>(
    HomeViewModel::class
) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAboutMeBinding.inflate(layoutInflater)
        return binding.root
    }

}