package com.android.assignment6.di.modules

import com.android.assignment6.data.offline.Offline
import com.android.assignment6.data.offline.OfflineImpl
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val offlineModule = module{
    single<Offline> { OfflineImpl(androidApplication()) }
}