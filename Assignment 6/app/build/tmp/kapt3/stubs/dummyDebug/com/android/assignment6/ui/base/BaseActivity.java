package com.android.assignment6.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\nH\u0014J\u0006\u0010\u001a\u001a\u00020\nR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/android/assignment6/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "localizationDelegate", "Lcom/akexorcist/localizationactivity/core/LocalizationActivityDelegate;", "getLocalizationDelegate", "()Lcom/akexorcist/localizationactivity/core/LocalizationActivityDelegate;", "localizationDelegate$delegate", "Lkotlin/Lazy;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "getApplicationContext", "getBaseContext", "getCurrentLanguage", "Ljava/util/Locale;", "getResources", "Landroid/content/res/Resources;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showRootedDailog", "app_dummyDebug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy localizationDelegate$delegate = null;
    
    public BaseActivity() {
        super();
    }
    
    private final com.akexorcist.localizationactivity.core.LocalizationActivityDelegate getLocalizationDelegate() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull
    android.content.Context newBase) {
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.content.Context getBaseContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.content.Context getApplicationContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.content.res.Resources getResources() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Locale getCurrentLanguage() {
        return null;
    }
    
    public final void showRootedDailog() {
    }
}