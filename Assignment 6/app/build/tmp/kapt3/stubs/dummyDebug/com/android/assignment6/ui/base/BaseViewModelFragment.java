package com.android.assignment6.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u001a\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00028\u00008VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006#"}, d2 = {"Lcom/android/assignment6/ui/base/BaseViewModelFragment;", "ViewModelType", "Lcom/android/assignment6/ui/base/BaseViewModel;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/android/assignment6/ui/base/BaseFragment;", "kClazz", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "activeNetworkStateObserver", "Landroidx/lifecycle/Observer;", "", "kotlin.jvm.PlatformType", "progressdialog", "Lcom/android/assignment6/util/CustomProgressDialog;", "viewModel", "getViewModel", "()Lcom/android/assignment6/ui/base/BaseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "dismissDialog", "", "initObservers", "networkStatusChanged", "isConnected", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "reAuthenticate", "registerNetworkStatusChangeObserver", "showDialog", "loadingMessage", "", "app_dummyDebug"})
public class BaseViewModelFragment<ViewModelType extends com.android.assignment6.ui.base.BaseViewModel, VB extends androidx.viewbinding.ViewBinding> extends com.android.assignment6.ui.base.BaseFragment<VB> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.android.assignment6.util.CustomProgressDialog progressdialog = null;
    private final androidx.lifecycle.Observer<java.lang.Boolean> activeNetworkStateObserver = null;
    
    public BaseViewModelFragment(@org.jetbrains.annotations.NotNull
    kotlin.reflect.KClass<ViewModelType> kClazz) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public ViewModelType getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public void initObservers() {
    }
    
    private final void registerNetworkStatusChangeObserver() {
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull
    java.lang.String loadingMessage) {
    }
    
    public final void dismissDialog() {
    }
    
    public void reAuthenticate() {
    }
    
    public void networkStatusChanged(boolean isConnected) {
    }
}