package com.android.assignment6.ui.base

import androidx.lifecycle.ViewModel
import com.android.assignment6.data.model.FailureException
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow

open class BaseViewModel : ViewModel() {

    private val mutableLoading = Channel<Loading>(Channel.BUFFERED)
    val loading get() = mutableLoading.receiveAsFlow()

    private val _error = Channel<FailureException>(Channel.BUFFERED)
    val error get() = _error.receiveAsFlow()

    internal val handler = CoroutineExceptionHandler { _, e ->
        mutableLoading.offer(Loading.OnError)
        when (e) {
            is FailureException.NetworkException -> {
                _error.offer(e)
            }
            is FailureException.InvalidUserException -> {
                _error.offer(e)
            }
            else -> {
                _error.offer(FailureException.FailedToConnectException("", -1))
            }
        }
    }
}