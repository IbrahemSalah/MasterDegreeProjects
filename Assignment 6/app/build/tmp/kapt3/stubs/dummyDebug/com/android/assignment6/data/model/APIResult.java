package com.android.assignment6.data.model;

import java.lang.System;

@androidx.annotation.Keep
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u0004*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/android/assignment6/data/model/APIResult;", "T", "", "()V", "Companion", "Failure", "Success", "Lcom/android/assignment6/data/model/APIResult$Success;", "Lcom/android/assignment6/data/model/APIResult$Failure;", "app_dummyDebug"})
public abstract class APIResult<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    public static final com.android.assignment6.data.model.APIResult.Companion Companion = null;
    
    private APIResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/android/assignment6/data/model/APIResult$Success;", "T", "Lcom/android/assignment6/data/model/APIResult;", "body", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/android/assignment6/data/model/APIResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_dummyDebug"})
    public static final class Success<T extends java.lang.Object> extends com.android.assignment6.data.model.APIResult<T> {
        @org.jetbrains.annotations.Nullable
        private final T body = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.android.assignment6.data.model.APIResult.Success<T> copy(@org.jetbrains.annotations.Nullable
        T body) {
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
        
        public Success(@org.jetbrains.annotations.Nullable
        T body) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final T getBody() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/android/assignment6/data/model/APIResult$Failure;", "T", "Lcom/android/assignment6/data/model/APIResult;", "error", "Lcom/android/assignment6/data/model/APIError;", "(Lcom/android/assignment6/data/model/APIError;)V", "getError", "()Lcom/android/assignment6/data/model/APIError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_dummyDebug"})
    public static final class Failure<T extends java.lang.Object> extends com.android.assignment6.data.model.APIResult<T> {
        @org.jetbrains.annotations.Nullable
        private final com.android.assignment6.data.model.APIError error = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.android.assignment6.data.model.APIResult.Failure<T> copy(@org.jetbrains.annotations.Nullable
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
        
        public Failure(@org.jetbrains.annotations.Nullable
        com.android.assignment6.data.model.APIError error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.android.assignment6.data.model.APIError component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.android.assignment6.data.model.APIError getError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\t\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/android/assignment6/data/model/APIResult$Companion;", "", "()V", "failure", "Lcom/android/assignment6/data/model/APIResult;", "T", "error", "Lcom/android/assignment6/data/model/APIError;", "success", "data", "(Ljava/lang/Object;)Lcom/android/assignment6/data/model/APIResult;", "app_dummyDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final <T extends java.lang.Object>com.android.assignment6.data.model.APIResult<T> success(T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final <T extends java.lang.Object>com.android.assignment6.data.model.APIResult<T> failure(@org.jetbrains.annotations.NotNull
        com.android.assignment6.data.model.APIError error) {
            return null;
        }
    }
}