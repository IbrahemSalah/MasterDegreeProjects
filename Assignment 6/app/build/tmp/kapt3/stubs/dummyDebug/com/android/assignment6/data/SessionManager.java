package com.android.assignment6.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/android/assignment6/data/SessionManager;", "", "repository", "Lcom/android/assignment6/data/repositories/Repository;", "(Lcom/android/assignment6/data/repositories/Repository;)V", "getRepository", "()Lcom/android/assignment6/data/repositories/Repository;", "current", "", "hasCachedUser", "", "logout", "", "setActiveSession", "loginResponse", "Companion", "app_dummyDebug"})
public final class SessionManager {
    @org.jetbrains.annotations.NotNull
    private final com.android.assignment6.data.repositories.Repository repository = null;
    @org.jetbrains.annotations.NotNull
    public static final com.android.assignment6.data.SessionManager.Companion Companion = null;
    private static com.android.assignment6.data.SessionManager instance;
    
    public SessionManager(@org.jetbrains.annotations.NotNull
    com.android.assignment6.data.repositories.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.assignment6.data.repositories.Repository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String current() {
        return null;
    }
    
    public final boolean hasCachedUser() {
        return false;
    }
    
    public final void setActiveSession(@org.jetbrains.annotations.NotNull
    java.lang.String loginResponse) {
    }
    
    public final void logout() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/android/assignment6/data/SessionManager$Companion;", "", "()V", "instance", "Lcom/android/assignment6/data/SessionManager;", "getInstance", "repository", "Lcom/android/assignment6/data/repositories/Repository;", "app_dummyDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.android.assignment6.data.SessionManager getInstance(@org.jetbrains.annotations.NotNull
        com.android.assignment6.data.repositories.Repository repository) {
            return null;
        }
    }
}