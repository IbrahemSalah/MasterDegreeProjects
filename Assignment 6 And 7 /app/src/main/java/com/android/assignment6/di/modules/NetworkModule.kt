package com.android.assignment6.di.modules

import android.content.Context
import com.android.assignment6.BuildConfig
import com.android.assignment6.data.remote.BaseAppAPI
import com.android.assignment6.util.NetworkConnectionInterceptor
import com.android.assignment6.util.NetworkHelper
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    single { provideOkHttpClient(get()) }

    single { provideRetrofit(get()) }

    single { provideApiService(get()) }

    single { provideNetworkHelper(androidApplication()) }
    single { provideNetworkConnectionInterceptor(androidApplication(), get()) }

}

private fun provideNetworkHelper(context: Context) = NetworkHelper(context)

private fun provideNetworkConnectionInterceptor(
    context: Context,
    networkHelper: NetworkHelper
) = NetworkConnectionInterceptor(context, networkHelper)

private fun provideOkHttpClient(networkConnectionInterceptor: NetworkConnectionInterceptor) =
    if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .callTimeout(5, TimeUnit.MINUTES)
            .readTimeout(5, TimeUnit.MINUTES)
            .connectTimeout(5, TimeUnit.MINUTES)
            .writeTimeout(5, TimeUnit.MINUTES)
            .addInterceptor(loggingInterceptor)
            .addInterceptor(networkConnectionInterceptor)
            .build()
    } else OkHttpClient
        .Builder()
        .callTimeout(5, TimeUnit.MINUTES)
        .readTimeout(5, TimeUnit.MINUTES)
        .connectTimeout(5, TimeUnit.MINUTES)
        .writeTimeout(5, TimeUnit.MINUTES)
        .addInterceptor(networkConnectionInterceptor)
        .build()

private fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
    Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BuildConfig.BASE_URL)
        .client(okHttpClient)
        .build()

private fun provideApiService(retrofit: Retrofit): BaseAppAPI =
    retrofit.create(BaseAppAPI::class.java)