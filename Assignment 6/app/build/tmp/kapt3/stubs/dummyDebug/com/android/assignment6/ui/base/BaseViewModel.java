package com.android.assignment6.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/android/assignment6/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_error", "Lkotlinx/coroutines/channels/Channel;", "Lcom/android/assignment6/data/model/FailureException;", "error", "Lkotlinx/coroutines/flow/Flow;", "getError", "()Lkotlinx/coroutines/flow/Flow;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getHandler$app_dummyDebug", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "loading", "Lcom/android/assignment6/ui/base/Loading;", "getLoading", "mutableLoading", "app_dummyDebug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.channels.Channel<com.android.assignment6.ui.base.Loading> mutableLoading = null;
    private final kotlinx.coroutines.channels.Channel<com.android.assignment6.data.model.FailureException> _error = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.android.assignment6.ui.base.Loading> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.android.assignment6.data.model.FailureException> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineExceptionHandler getHandler$app_dummyDebug() {
        return null;
    }
}