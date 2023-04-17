package com.android.assignment6.di.modules

import com.android.assignment6.data.database.AppDatabase
import com.android.assignment6.data.database.DbDataSource
import com.android.assignment6.data.database.DbDataSourceImpl

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dbModule = module {
    single { AppDatabase.getInstance(androidContext()) }

    single<DbDataSource> { DbDataSourceImpl(get()) }
}