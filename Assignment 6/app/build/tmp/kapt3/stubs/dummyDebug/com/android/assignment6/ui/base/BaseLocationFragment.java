package com.android.assignment6.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 32\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0006\u0010\u001e\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u0015J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001cH&J\b\u0010$\u001a\u00020\u001cH&J\b\u0010%\u001a\u00020\u001cH&J\b\u0010&\u001a\u00020\u001cH\u0016J\b\u0010\'\u001a\u00020\u001cH\u0016J\u001a\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0014\u0010-\u001a\u00020\u001c2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0/J\b\u00100\u001a\u00020\u001cH\u0016J\b\u00101\u001a\u00020\u001cH\u0003J\b\u00102\u001a\u00020\u001cH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/android/assignment6/ui/base/BaseLocationFragment;", "Landroidx/fragment/app/Fragment;", "()V", "enableLocationLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "mCurrentLocation", "Landroid/location/Location;", "getMCurrentLocation", "()Landroid/location/Location;", "setMCurrentLocation", "(Landroid/location/Location;)V", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "mLocationSettingsRequest", "Lcom/google/android/gms/location/LocationSettingsRequest;", "mRequestingLocationUpdates", "", "mSettingsClient", "Lcom/google/android/gms/location/SettingsClient;", "requestPermissionLauncher", "", "", "initLocation", "", "initObservers", "isLocationEnabled", "isPermissionGranted", "onAttach", "context", "Landroid/content/Context;", "onLocationDisabled", "onLocationPermissionDenied", "onLocationUpdated", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "preCheck", "action", "Lkotlin/Function0;", "startLocation", "startLocationUpdates", "stopLocationUpdates", "Companion", "app_dummyDebug"})
public abstract class BaseLocationFragment extends androidx.fragment.app.Fragment {
    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestPermissionLauncher;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> enableLocationLauncher;
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    private com.google.android.gms.location.SettingsClient mSettingsClient;
    private com.google.android.gms.location.LocationRequest mLocationRequest;
    private com.google.android.gms.location.LocationSettingsRequest mLocationSettingsRequest;
    private com.google.android.gms.location.LocationCallback mLocationCallback;
    private boolean mRequestingLocationUpdates = false;
    @org.jetbrains.annotations.Nullable
    private android.location.Location mCurrentLocation;
    @org.jetbrains.annotations.NotNull
    public static final com.android.assignment6.ui.base.BaseLocationFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "BaseLocationFragment";
    public static final long FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS = 50000L;
    public static final long UPDATE_INTERVAL_IN_MILLISECONDS = 50000L;
    public static final float SMALLEST_DISPLACEMENT = 170.0F;
    
    public BaseLocationFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.location.Location getMCurrentLocation() {
        return null;
    }
    
    public final void setMCurrentLocation(@org.jetbrains.annotations.Nullable
    android.location.Location p0) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    public void initObservers() {
    }
    
    private final void initLocation() {
    }
    
    public void startLocation() {
    }
    
    /**
     * Starting location updates
     * Check whether location settings are satisfied and then
     * location updates will be requested
     */
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void startLocationUpdates() {
    }
    
    public void stopLocationUpdates() {
    }
    
    public final void preCheck(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public final boolean isPermissionGranted() {
        return false;
    }
    
    public final boolean isLocationEnabled() {
        return false;
    }
    
    public abstract void onLocationUpdated();
    
    public abstract void onLocationDisabled();
    
    public abstract void onLocationPermissionDenied();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/android/assignment6/ui/base/BaseLocationFragment$Companion;", "", "()V", "FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS", "", "SMALLEST_DISPLACEMENT", "", "TAG", "", "UPDATE_INTERVAL_IN_MILLISECONDS", "app_dummyDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}