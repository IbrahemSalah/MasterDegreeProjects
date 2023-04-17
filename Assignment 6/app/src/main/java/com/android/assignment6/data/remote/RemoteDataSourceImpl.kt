package com.android.assignment6.data.remote

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RemoteDataSourceImp(private val remoteApi: BaseAppAPI) : RemoteDataSource {

    override suspend fun getBaseAppResponse() = withContext(Dispatchers.IO) {
        remoteApi.getBaseAppResponse()
    }
}