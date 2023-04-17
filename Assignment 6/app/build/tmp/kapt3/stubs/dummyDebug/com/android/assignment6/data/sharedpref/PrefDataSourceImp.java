package com.android.assignment6.data.sharedpref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0013H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006$"}, d2 = {"Lcom/android/assignment6/data/sharedpref/PrefDataSourceImp;", "Lcom/android/assignment6/data/sharedpref/PrefDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefManager", "Landroid/content/SharedPreferences;", "getPrefManager", "()Landroid/content/SharedPreferences;", "prefManager$delegate", "Lkotlin/Lazy;", "getBooleanPreference", "", "key", "", "defaultValue", "getIntegerPreference", "", "getLongPreference", "", "getSharedPrefBaseAppResponse", "Lcom/android/assignment6/data/model/BaseAppResponse;", "getStringPreference", "getToken", "logOut", "", "setBooleanPreference", "value", "setIntegerPreference", "setLongPreference", "setSharedPrefBaseAppResponse", "baseAppResponse", "setStringPreference", "setToken", "token", "Constants", "app_dummyDebug"})
public final class PrefDataSourceImp implements com.android.assignment6.data.sharedpref.PrefDataSource {
    private final android.content.Context context = null;
    private final kotlin.Lazy prefManager$delegate = null;
    
    public PrefDataSourceImp(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final android.content.SharedPreferences getPrefManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getToken() {
        return null;
    }
    
    @java.lang.Override()
    public void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.android.assignment6.data.model.BaseAppResponse getSharedPrefBaseAppResponse() {
        return null;
    }
    
    @java.lang.Override()
    public void setSharedPrefBaseAppResponse(@org.jetbrains.annotations.NotNull()
    com.android.assignment6.data.model.BaseAppResponse baseAppResponse) {
    }
    
    @java.lang.Override()
    public void logOut() {
    }
    
    private final void setBooleanPreference(java.lang.String key, boolean value) {
    }
    
    private final boolean getBooleanPreference(java.lang.String key, boolean defaultValue) {
        return false;
    }
    
    private final void setStringPreference(java.lang.String key, java.lang.String value) {
    }
    
    private final java.lang.String getStringPreference(java.lang.String key, java.lang.String defaultValue) {
        return null;
    }
    
    private final int getIntegerPreference(java.lang.String key, int defaultValue) {
        return 0;
    }
    
    private final void setIntegerPreference(java.lang.String key, int value) {
    }
    
    private final void setLongPreference(java.lang.String key, long value) {
    }
    
    private final long getLongPreference(java.lang.String key, long defaultValue) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/android/assignment6/data/sharedpref/PrefDataSourceImp$Constants;", "", "()V", "BASE_APP_RESPONSE", "", "TOKEN_PREF", "app_dummyDebug"})
    public static final class Constants {
        @org.jetbrains.annotations.NotNull()
        public static final com.android.assignment6.data.sharedpref.PrefDataSourceImp.Constants INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TOKEN_PREF = "pref_token";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_APP_RESPONSE = "base_app_response";
        
        private Constants() {
            super();
        }
    }
}