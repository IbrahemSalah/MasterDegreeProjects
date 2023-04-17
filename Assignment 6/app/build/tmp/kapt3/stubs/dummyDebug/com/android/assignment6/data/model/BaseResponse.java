package com.android.assignment6.data.model;

import java.lang.System;

@androidx.annotation.Keep
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/android/assignment6/data/model/BaseResponse;", "T", "", "statusCode", "", "body", "error", "Lcom/android/assignment6/data/model/APIError;", "(ILjava/lang/Object;Lcom/android/assignment6/data/model/APIError;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/android/assignment6/data/model/APIError;", "getStatusCode", "()I", "component1", "component2", "component3", "copy", "(ILjava/lang/Object;Lcom/android/assignment6/data/model/APIError;)Lcom/android/assignment6/data/model/BaseResponse;", "equals", "", "other", "hashCode", "toString", "", "app_dummyDebug"})
public final class BaseResponse<T extends java.lang.Object> {
    private final int statusCode = 0;
    @org.jetbrains.annotations.Nullable
    private final T body = null;
    @org.jetbrains.annotations.Nullable
    private final com.android.assignment6.data.model.APIError error = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.android.assignment6.data.model.BaseResponse<T> copy(int statusCode, @org.jetbrains.annotations.Nullable
    T body, @org.jetbrains.annotations.Nullable
    com.android.assignment6.data.model.APIError error) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public BaseResponse(int statusCode, @org.jetbrains.annotations.Nullable
    T body, @org.jetbrains.annotations.Nullable
    com.android.assignment6.data.model.APIError error) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getBody() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.android.assignment6.data.model.APIError component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.android.assignment6.data.model.APIError getError() {
        return null;
    }
}