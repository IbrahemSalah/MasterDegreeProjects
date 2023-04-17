package com.android.assignment6.data.model;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B\u0019\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/android/assignment6/data/model/FailureException;", "Ljava/io/IOException;", "msg", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "FailedToConnectException", "InvalidUserException", "NetworkException", "RevokedAccountException", "ServerException", "UnknownException", "Lcom/android/assignment6/data/model/FailureException$ServerException;", "Lcom/android/assignment6/data/model/FailureException$InvalidUserException;", "Lcom/android/assignment6/data/model/FailureException$NetworkException;", "Lcom/android/assignment6/data/model/FailureException$UnknownException;", "Lcom/android/assignment6/data/model/FailureException$RevokedAccountException;", "Lcom/android/assignment6/data/model/FailureException$FailedToConnectException;", "app_dummyDebug"})
public abstract class FailureException extends java.io.IOException {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String msg = null;
    private final int code = 0;
    
    private FailureException(java.lang.String msg, int code) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getMsg() {
        return null;
    }
    
    public int getCode() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/android/assignment6/data/model/FailureException$ServerException;", "Lcom/android/assignment6/data/model/FailureException;", "msg", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_dummyDebug"})
    public static final class ServerException extends com.android.assignment6.data.model.FailureException {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String msg = null;
        private final int code = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.assignment6.data.model.FailureException.ServerException copy(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, int code) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ServerException(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, int code) {
            super(null, 0);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getMsg() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @java.lang.Override()
        public int getCode() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/android/assignment6/data/model/FailureException$InvalidUserException;", "Lcom/android/assignment6/data/model/FailureException;", "msg", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_dummyDebug"})
    public static final class InvalidUserException extends com.android.assignment6.data.model.FailureException {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String msg = null;
        private final int code = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.assignment6.data.model.FailureException.InvalidUserException copy(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, int code) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public InvalidUserException(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, int code) {
            super(null, 0);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getMsg() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @java.lang.Override()
        public int getCode() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/android/assignment6/data/model/FailureException$NetworkException;", "Lcom/android/assignment6/data/model/FailureException;", "msg", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_dummyDebug"})
    public static final class NetworkException extends com.android.assignment6.data.model.FailureException {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String msg = null;
        private final int code = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.assignment6.data.model.FailureException.NetworkException copy(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, int code) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public NetworkException(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, int code) {
            super(null, 0);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getMsg() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @java.lang.Override()
        public int getCode() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/android/assignment6/data/model/FailureException$UnknownException;", "Lcom/android/assignment6/data/model/FailureException;", "msg", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "app_dummyDebug"})
    public static class UnknownException extends com.android.assignment6.data.model.FailureException {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String msg = null;
        private final int code = 0;
        
        public UnknownException(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, int code) {
            super(null, 0);
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getMsg() {
            return null;
        }
        
        @java.lang.Override()
        public int getCode() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/android/assignment6/data/model/FailureException$RevokedAccountException;", "Lcom/android/assignment6/data/model/FailureException;", "msg", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "app_dummyDebug"})
    public static class RevokedAccountException extends com.android.assignment6.data.model.FailureException {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String msg = null;
        private final int code = 0;
        
        public RevokedAccountException(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, int code) {
            super(null, 0);
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getMsg() {
            return null;
        }
        
        @java.lang.Override()
        public int getCode() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/android/assignment6/data/model/FailureException$FailedToConnectException;", "Lcom/android/assignment6/data/model/FailureException;", "msg", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "app_dummyDebug"})
    public static class FailedToConnectException extends com.android.assignment6.data.model.FailureException {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String msg = null;
        private final int code = 0;
        
        public FailedToConnectException(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, int code) {
            super(null, 0);
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getMsg() {
            return null;
        }
        
        @java.lang.Override()
        public int getCode() {
            return 0;
        }
    }
}