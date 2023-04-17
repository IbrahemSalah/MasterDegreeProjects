package com.android.assignment6.ui.base

sealed class Loading {
    object OnLoading : Loading()
    object OnSuccess : Loading()
    object OnError : Loading()
}
