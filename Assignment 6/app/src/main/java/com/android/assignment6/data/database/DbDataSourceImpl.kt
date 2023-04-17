package com.android.assignment6.data.database

class DbDataSourceImpl(private val appDatabase: AppDatabase) : DbDataSource {
    override suspend fun getAllDataInTable() = appDatabase.baseAppDao().getAllDataInTable()
}