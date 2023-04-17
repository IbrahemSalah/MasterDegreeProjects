package com.android.assignment6.data.remote

import com.android.assignment6.data.model.BaseAppResponse
import retrofit2.Response
import retrofit2.http.POST


interface BaseAppAPI {

    @POST("dummy/getBaseAppResponse")
    suspend fun getBaseAppResponse(): Response<BaseAppResponse>
}