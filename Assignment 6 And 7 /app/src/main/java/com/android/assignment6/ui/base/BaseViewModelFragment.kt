package com.android.assignment6.ui.base

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import com.android.assignment6.R
import com.android.assignment6.data.model.FailureException
import com.android.assignment6.util.CustomProgressDialog
import com.android.assignment6.util.NetworkStateManager
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.reflect.KClass

open class BaseViewModelFragment<out ViewModelType : BaseViewModel, VB : ViewBinding>
    (kClazz: KClass<ViewModelType>) : BaseFragment<VB>() {

    open val viewModel: ViewModelType by viewModel(clazz = kClazz)

    private val progressdialog = CustomProgressDialog()

    private val activeNetworkStateObserver =
        Observer { isConnected: Boolean ->
            networkStatusChanged(isConnected)
        }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initObservers()
        registerNetworkStatusChangeObserver()
    }

    open fun initObservers() {

        viewModel.loading.onEach {
            when (it) {
                Loading.OnLoading -> showDialog(requireActivity().getString(R.string.loading))
                Loading.OnSuccess -> showDialog(requireActivity().getString(R.string.loading))
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
                    reAuthenticate()
                }
                is FailureException.NetworkException -> {
                    Toast.makeText(context, getString(R.string.network_error), Toast.LENGTH_SHORT)
                        .show()
                }
                is FailureException.RevokedAccountException -> {
                }
                is FailureException.ServerException -> {
                    Toast.makeText(
                        context,
                        getString(R.string.connect_to_server),
                        Toast.LENGTH_SHORT
                    )
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

    private fun registerNetworkStatusChangeObserver() {
        NetworkStateManager.getInstance().getNetworkConnectivityStatus()
            .observe(requireActivity(), activeNetworkStateObserver)
    }

    fun showDialog(loadingMessage: String) {
        progressdialog.show(
            requireContext(),
            loadingMessage
        )
    }

    fun dismissDialog() {
        progressdialog.dialog?.dismiss()
    }

    open fun reAuthenticate() {
    }

    open fun networkStatusChanged(isConnected: Boolean) {

    }
}
