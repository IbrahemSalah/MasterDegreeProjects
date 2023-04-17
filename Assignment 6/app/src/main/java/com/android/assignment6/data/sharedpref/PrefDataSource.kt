package com.android.assignment6.data.sharedpref

import com.android.assignment6.data.model.BaseAppResponse


interface PrefDataSource {

    fun getToken(): String
    fun setToken(token: String)

    fun getSharedPrefBaseAppResponse(): BaseAppResponse?
    fun setSharedPrefBaseAppResponse(baseAppResponse: BaseAppResponse)

    fun logOut()
}