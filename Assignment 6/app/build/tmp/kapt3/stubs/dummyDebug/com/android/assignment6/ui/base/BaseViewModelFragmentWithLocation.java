package com.android.assignment6.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00028\u00008VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/android/assignment6/ui/base/BaseViewModelFragmentWithLocation;", "ViewModelType", "Lcom/android/assignment6/ui/base/BaseViewModel;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/android/assignment6/ui/base/BaseFragmentWithLocation;", "kClazz", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "progressdialog", "Lcom/android/assignment6/util/CustomProgressDialog;", "viewModel", "getViewModel", "()Lcom/android/assignment6/ui/base/BaseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "dismissDialog", "", "initObservers", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showDialog", "app_dummyDebug"})
public class BaseViewModelFragmentWithLocation<ViewModelType extends com.android.assignment6.ui.base.BaseViewModel, VB extends androidx.viewbinding.ViewBinding> extends com.android.assignment6.ui.base.BaseFragmentWithLocation<VB> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.android.assignment6.util.CustomProgressDialog progressdialog = null;
    
    public BaseViewModelFragmentWithLocation(@org.jetbrains.annotations.NotNull
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
    
    @java.lang.Override
    public void initObservers() {
    }
    
    public final void showDialog() {
    }
    
    public final void dismissDialog() {
    }
}