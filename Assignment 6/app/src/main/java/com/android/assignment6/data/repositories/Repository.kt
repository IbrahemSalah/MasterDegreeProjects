package com.android.assignment6.data.repositories


import com.android.assignment6.data.database.DbDataSource
import com.android.assignment6.data.model.APIResult
import com.android.assignment6.data.model.BaseAppResponse
import com.android.assignment6.data.raw.RawDataSource
import com.android.assignment6.data.sharedpref.PrefDataSource

interface Repository : PrefDataSource, DbDataSource, RawDataSource {

    suspend fun getBaseAppResponse(): APIResult<BaseAppResponse>
    fun dummyOffline(): APIResult<String>
}
