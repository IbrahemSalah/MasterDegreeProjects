package com.android.assignment6.di.modules

import com.google.gson.Gson
import com.android.assignment6.data.raw.RawDataSource
import com.android.assignment6.data.raw.RawDataSourceImp
import com.android.assignment6.data.remote.RemoteDataSource
import com.android.assignment6.data.remote.RemoteDataSourceImp
import com.android.assignment6.data.sharedpref.PrefDataSource
import com.android.assignment6.data.sharedpref.PrefDataSourceImp
import com.android.assignment6.data.repositories.Repository
import com.android.assignment6.data.repositories.RepositoryImp
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val repositoryModule = module {
    single<RemoteDataSource> {
        return@single RemoteDataSourceImp(get())
    }
    single<RawDataSource> { RawDataSourceImp(androidContext(), Gson()) }
    single<PrefDataSource> { PrefDataSourceImp(androidApplication()) }

    single<Repository> {
        RepositoryImp(
            remoteDataSource = get(),
            prefDataSource = get(),
            offline = get(),
            dbDataSource = get(),
            rawDataSource = get()
        )
    }
}
