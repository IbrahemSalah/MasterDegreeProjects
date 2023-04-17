package com.android.assignment6.di.modules

import com.android.assignment6.data.SessionManager
import org.koin.dsl.module

val appModule = module {
    single { SessionManager.getInstance(get()) }
}