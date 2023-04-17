package com.android.assignment6.ui.base;

import java.lang.System;

@kotlin.Suppress(names = {"PropertyName"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/android/assignment6/ui/base/BaseFragmentWithLocation;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/android/assignment6/ui/base/BaseLocationFragment;", "()V", "_binding", "get_binding", "()Landroidx/viewbinding/ViewBinding;", "set_binding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "initViews", "", "onDestroyView", "onLocationDisabled", "onLocationPermissionDenied", "onLocationUpdated", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_dummyDebug"})
public class BaseFragmentWithLocation<VB extends androidx.viewbinding.ViewBinding> extends com.android.assignment6.ui.base.BaseLocationFragment {
    @org.jetbrains.annotations.Nullable
    private VB _binding;
    
    public BaseFragmentWithLocation() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    protected final VB get_binding() {
        return null;
    }
    
    protected final void set_binding(@org.jetbrains.annotations.Nullable
    VB p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final VB getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    public void initViews() {
    }
    
    @java.lang.Override
    public void onLocationUpdated() {
    }
    
    @java.lang.Override
    public void onLocationDisabled() {
    }
    
    @java.lang.Override
    public void onLocationPermissionDenied() {
    }
}