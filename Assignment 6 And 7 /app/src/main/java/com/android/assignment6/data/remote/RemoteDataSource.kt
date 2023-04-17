package com.android.assignment6.data.remote

import com.android.assignment6.data.model.BaseAppResponse
import retrofit2.Response

interface RemoteDataSource {

    suspend fun getBaseAppResponse(): Response<BaseAppResponse>
}