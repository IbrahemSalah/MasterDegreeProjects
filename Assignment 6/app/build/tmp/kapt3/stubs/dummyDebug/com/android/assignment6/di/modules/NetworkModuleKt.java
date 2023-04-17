package com.android.assignment6.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0014"}, d2 = {"networkModule", "Lorg/koin/core/module/Module;", "getNetworkModule", "()Lorg/koin/core/module/Module;", "provideApiService", "Lcom/android/assignment6/data/remote/BaseAppAPI;", "retrofit", "Lretrofit2/Retrofit;", "provideNetworkConnectionInterceptor", "Lcom/android/assignment6/util/NetworkConnectionInterceptor;", "context", "Landroid/content/Context;", "networkHelper", "Lcom/android/assignment6/util/NetworkHelper;", "provideNetworkHelper", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "networkConnectionInterceptor", "provideRetrofit", "okHttpClient", "app_dummyDebug"})
public final class NetworkModuleKt {
    @org.jetbrains.annotations.NotNull
    private static final org.koin.core.module.Module networkModule = null;
    
    @org.jetbrains.annotations.NotNull
    public static final org.koin.core.module.Module getNetworkModule() {
        return null;
    }
    
    private static final com.android.assignment6.util.NetworkHelper provideNetworkHelper(android.content.Context context) {
        return null;
    }
    
    private static final com.android.assignment6.util.NetworkConnectionInterceptor provideNetworkConnectionInterceptor(android.content.Context context, com.android.assignment6.util.NetworkHelper networkHelper) {
        return null;
    }
    
    private static final okhttp3.OkHttpClient provideOkHttpClient(com.android.assignment6.util.NetworkConnectionInterceptor networkConnectionInterceptor) {
        return null;
    }
    
    private static final retrofit2.Retrofit provideRetrofit(okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    private static final com.android.assignment6.data.remote.BaseAppAPI provideApiService(retrofit2.Retrofit retrofit) {
        return null;
    }
}