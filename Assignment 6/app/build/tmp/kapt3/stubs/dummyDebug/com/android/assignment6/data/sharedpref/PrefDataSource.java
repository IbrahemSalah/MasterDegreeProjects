package com.android.assignment6.data.sharedpref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/android/assignment6/data/sharedpref/PrefDataSource;", "", "getSharedPrefBaseAppResponse", "Lcom/android/assignment6/data/model/BaseAppResponse;", "getToken", "", "logOut", "", "setSharedPrefBaseAppResponse", "baseAppResponse", "setToken", "token", "app_dummyDebug"})
public abstract interface PrefDataSource {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getToken();
    
    public abstract void setToken(@org.jetbrains.annotations.NotNull
    java.lang.String token);
    
    @org.jetbrains.annotations.Nullable
    public abstract com.android.assignment6.data.model.BaseAppResponse getSharedPrefBaseAppResponse();
    
    public abstract void setSharedPrefBaseAppResponse(@org.jetbrains.annotations.NotNull
    com.android.assignment6.data.model.BaseAppResponse baseAppResponse);
    
    public abstract void logOut();
}