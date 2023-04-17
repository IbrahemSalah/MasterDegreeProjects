package com.android.assignment6.util;

import java.lang.System;

@kotlin.jvm.JvmName(name = "PermissionUtils")
@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0006\u0010\t\u001a\u00020\u0001\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"MANAGE_EXTERNAL_STORAGE_PERMISSION", "", "NOT_APPLICABLE", "checkStoragePermission", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "checkStoragePermissionApi19", "checkStoragePermissionApi30", "getLegacyStorageStatus", "getPermissionStatus", "getStoragePermissionName", "openPermissionSettings", "", "requestStoragePermission", "requestStoragePermissionApi19", "requestStoragePermissionApi30", "app_dummyDebug"})
public final class PermissionUtils {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MANAGE_EXTERNAL_STORAGE_PERMISSION = "android:manage_external_storage";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NOT_APPLICABLE = "N/A";
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getStoragePermissionName() {
        return null;
    }
    
    public static final void openPermissionSettings(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getLegacyStorageStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getPermissionStatus(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
    
    public static final boolean checkStoragePermission(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        return false;
    }
    
    public static final void requestStoragePermission(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    @androidx.annotation.RequiresApi(value = 30)
    public static final boolean checkStoragePermissionApi30(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = 30)
    public static final void requestStoragePermissionApi30(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    @androidx.annotation.RequiresApi(value = 19)
    public static final boolean checkStoragePermissionApi19(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = 19)
    public static final void requestStoragePermissionApi19(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
    }
}