package com.android.assignment6

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.android.assignment6.databinding.ActivityHomeBinding
import com.android.assignment6.ui.base.BaseActivity


class HomeActivity : BaseActivity() {
    private var _binding: ActivityHomeBinding? = null
    private val binding: ActivityHomeBinding get() = _binding as ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.dashboard_navigation_graph_host) as NavHostFragment

        val navController = navHostFragment.navController

        binding.bottomNav.setupWithNavController(navController)
    }

}