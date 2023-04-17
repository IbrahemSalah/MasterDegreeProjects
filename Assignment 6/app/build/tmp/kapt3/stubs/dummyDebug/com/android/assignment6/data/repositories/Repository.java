package com.android.assignment6.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/android/assignment6/data/repositories/Repository;", "Lcom/android/assignment6/data/sharedpref/PrefDataSource;", "Lcom/android/assignment6/data/database/DbDataSource;", "Lcom/android/assignment6/data/raw/RawDataSource;", "dummyOffline", "Lcom/android/assignment6/data/model/APIResult;", "", "getBaseAppResponse", "Lcom/android/assignment6/data/model/BaseAppResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_dummyDebug"})
public abstract interface Repository extends com.android.assignment6.data.sharedpref.PrefDataSource, com.android.assignment6.data.database.DbDataSource, com.android.assignment6.data.raw.RawDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBaseAppResponse(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.android.assignment6.data.model.APIResult<com.android.assignment6.data.model.BaseAppResponse>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.assignment6.data.model.APIResult<java.lang.String> dummyOffline();
}