package com.android.assignment6.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0011\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u0010\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0013H\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0011H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/android/assignment6/data/repositories/RepositoryImp;", "Lcom/android/assignment6/data/repositories/Repository;", "remoteDataSource", "Lcom/android/assignment6/data/remote/RemoteDataSource;", "prefDataSource", "Lcom/android/assignment6/data/sharedpref/PrefDataSource;", "offline", "Lcom/android/assignment6/data/offline/Offline;", "dbDataSource", "Lcom/android/assignment6/data/database/DbDataSource;", "rawDataSource", "Lcom/android/assignment6/data/raw/RawDataSource;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/android/assignment6/data/remote/RemoteDataSource;Lcom/android/assignment6/data/sharedpref/PrefDataSource;Lcom/android/assignment6/data/offline/Offline;Lcom/android/assignment6/data/database/DbDataSource;Lcom/android/assignment6/data/raw/RawDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "dummyOffline", "Lcom/android/assignment6/data/model/APIResult;", "", "getAllDataInTable", "Lcom/android/assignment6/data/model/BaseAppResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBaseAppResponse", "getLocalBaseAppResponse", "Ljava/util/ArrayList;", "getSharedPrefBaseAppResponse", "getToken", "logOut", "", "safeAPIResult", "T", "response", "Lretrofit2/Response;", "setSharedPrefBaseAppResponse", "baseAppResponse", "setToken", "token", "app_dummyDebug"})
public final class RepositoryImp implements com.android.assignment6.data.repositories.Repository {
    private final com.android.assignment6.data.remote.RemoteDataSource remoteDataSource = null;
    private final com.android.assignment6.data.sharedpref.PrefDataSource prefDataSource = null;
    private final com.android.assignment6.data.offline.Offline offline = null;
    private final com.android.assignment6.data.database.DbDataSource dbDataSource = null;
    private final com.android.assignment6.data.raw.RawDataSource rawDataSource = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    
    public RepositoryImp(@org.jetbrains.annotations.NotNull
    com.android.assignment6.data.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    com.android.assignment6.data.sharedpref.PrefDataSource prefDataSource, @org.jetbrains.annotations.NotNull
    com.android.assignment6.data.offline.Offline offline, @org.jetbrains.annotations.NotNull
    com.android.assignment6.data.database.DbDataSource dbDataSource, @org.jetbrains.annotations.NotNull
    com.android.assignment6.data.raw.RawDataSource rawDataSource, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getToken() {
        return null;
    }
    
    @java.lang.Override
    public void setToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.android.assignment6.data.model.BaseAppResponse getSharedPrefBaseAppResponse() {
        return null;
    }
    
    @java.lang.Override
    public void setSharedPrefBaseAppResponse(@org.jetbrains.annotations.NotNull
    com.android.assignment6.data.model.BaseAppResponse baseAppResponse) {
    }
    
    @java.lang.Override
    public void logOut() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getLocalBaseAppResponse(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.ArrayList<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getBaseAppResponse(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.android.assignment6.data.model.APIResult<com.android.assignment6.data.model.BaseAppResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.android.assignment6.data.model.APIResult<java.lang.String> dummyOffline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllDataInTable(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.android.assignment6.data.model.BaseAppResponse> continuation) {
        return null;
    }
    
    private final <T extends java.lang.Object>com.android.assignment6.data.model.APIResult<T> safeAPIResult(retrofit2.Response<T> response) {
        return null;
    }
}