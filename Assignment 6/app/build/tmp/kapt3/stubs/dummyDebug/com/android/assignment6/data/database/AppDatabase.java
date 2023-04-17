package com.android.assignment6.data.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.android.assignment6.data.database.typeConverter.DateTypeConverter.class})
@androidx.room.Database(entities = {com.android.assignment6.data.model.BaseAppResponse.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/assignment6/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "baseAppDao", "Lcom/android/assignment6/data/database/BaseAppDao;", "Companion", "app_dummyDebug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.assignment6.data.database.AppDatabase.Companion Companion = null;
    private static final java.lang.String DB_NAME = "base_app.db";
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.assignment6.data.database.BaseAppDao baseAppDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/android/assignment6/data/database/AppDatabase$Companion;", "", "()V", "DB_NAME", "", "getInstance", "Lcom/android/assignment6/data/database/AppDatabase;", "context", "Landroid/content/Context;", "app_dummyDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.assignment6.data.database.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}