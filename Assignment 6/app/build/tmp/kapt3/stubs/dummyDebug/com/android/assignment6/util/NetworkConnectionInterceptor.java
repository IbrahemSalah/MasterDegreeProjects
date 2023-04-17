package com.android.assignment6.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/android/assignment6/util/NetworkConnectionInterceptor;", "Lokhttp3/Interceptor;", "Lorg/koin/core/component/KoinComponent;", "context", "Landroid/content/Context;", "network", "Lcom/android/assignment6/util/NetworkHelper;", "(Landroid/content/Context;Lcom/android/assignment6/util/NetworkHelper;)V", "repository", "Lcom/android/assignment6/data/repositories/Repository;", "getRepository", "()Lcom/android/assignment6/data/repositories/Repository;", "repository$delegate", "Lkotlin/Lazy;", "sessionManager", "Lcom/android/assignment6/data/SessionManager;", "getSessionManager", "()Lcom/android/assignment6/data/SessionManager;", "sessionManager$delegate", "getLanguage", "Ljava/util/Locale;", "getcurrentlangauge", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_dummyDebug"})
public final class NetworkConnectionInterceptor implements okhttp3.Interceptor, org.koin.core.component.KoinComponent {
    private final android.content.Context context = null;
    private final com.android.assignment6.util.NetworkHelper network = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sessionManager$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy repository$delegate = null;
    
    public NetworkConnectionInterceptor(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.android.assignment6.util.NetworkHelper network) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.assignment6.data.SessionManager getSessionManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.assignment6.data.repositories.Repository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Locale getLanguage(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getcurrentlangauge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.koin.core.Koin getKoin() {
        return null;
    }
}