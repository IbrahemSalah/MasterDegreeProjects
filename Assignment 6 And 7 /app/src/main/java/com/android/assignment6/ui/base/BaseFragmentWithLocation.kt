package com.android.assignment6.ui.base

import android.os.Bundle
import android.view.View
import androidx.viewbinding.ViewBinding

@Suppress("PropertyName")
open class BaseFragmentWithLocation<VB : ViewBinding> : BaseLocationFragment() {

    protected var _binding: VB? = null
    protected val binding: VB get() = _binding as VB

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    open fun initViews() {

    }

    open override fun onLocationUpdated() {

    }

    open override fun onLocationDisabled() {

    }

    open override fun onLocationPermissionDenied() {

    }

}
