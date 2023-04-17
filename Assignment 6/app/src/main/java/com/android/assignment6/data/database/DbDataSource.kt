package com.android.assignment6.data.database

import com.android.assignment6.data.model.BaseAppResponse

interface DbDataSource {
    suspend fun getAllDataInTable(): BaseAppResponse
}