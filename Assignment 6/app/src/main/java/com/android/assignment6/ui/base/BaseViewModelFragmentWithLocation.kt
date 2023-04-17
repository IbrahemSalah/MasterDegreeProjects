package com.android.assignment6.ui.base

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import com.android.assignment6.R
import com.android.assignment6.data.model.FailureException
import com.android.assignment6.util.CustomProgressDialog
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.reflect.KClass

open class BaseViewModelFragmentWithLocation <out ViewModelType : BaseViewModel, VB : ViewBinding>
    (kClazz: KClass<ViewModelType>) : BaseFragmentWithLocation<VB>() {

    open val viewModel: ViewModelType by viewModel(clazz = kClazz)

    private val progressdialog = CustomProgressDialog()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initObservers()
    }

    override fun initObservers() {

        viewModel.loading.onEach {
            when (it) {
                Loading.OnLoading -> showDialog()
                Loading.OnSuccess -> showDialog()
                Loading.OnError -> dismissDialog()
            }

        }.launchIn(lifecycleScope)

        viewModel.error.onEach {
            dismissDialog()
            when (it) {
                is FailureException.FailedToConnectException -> {
                    Toast.makeText(
                        context,
                        getString(R.string.connection_refused),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                is FailureException.InvalidUserException -> {
                    Toast.makeText(context, getString(R.string.session_expired), Toast.LENGTH_SHORT)
                        .show()
                }
                is FailureException.NetworkException -> {
                    Toast.makeText(context, getString(R.string.network_error), Toast.LENGTH_SHORT)
                        .show()
                }
                is FailureException.RevokedAccountException -> {
                }
                is FailureException.ServerException -> {
                    Toast.makeText(context, getString(R.string.connect_to_server), Toast.LENGTH_SHORT)
                        .show()
                }
                is FailureException.UnknownException -> {
                    Toast.makeText(
                        context,
                        getString(R.string.something_went_wrong),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }.launchIn(lifecycleScope)

    }

    fun showDialog() {
        progressdialog.show(
            requireContext(),
            requireActivity().getString(R.string.loading)
        )
    }

    fun dismissDialog() {
        progressdialog.dialog?.dismiss()
    }


}
