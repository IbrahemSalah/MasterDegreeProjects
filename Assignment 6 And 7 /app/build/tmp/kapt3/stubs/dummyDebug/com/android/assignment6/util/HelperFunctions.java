package com.android.assignment6.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u001e\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001dJ\u0016\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\'J\u001a\u0010(\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J&\u0010+\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u000201\u00a8\u00062"}, d2 = {"Lcom/android/assignment6/util/HelperFunctions;", "", "()V", "contentValues", "Landroid/content/ContentValues;", "convertBitmapToBase64", "", "bitmap", "Landroid/graphics/Bitmap;", "createPartFromString", "Lokhttp3/RequestBody;", "descriptionString", "createTempImageFile", "context", "Landroid/content/Context;", "deleteObservationImage", "", "uri", "Landroid/net/Uri;", "getAppVersion", "getGUID", "getGenericAPIError", "Lcom/android/assignment6/data/model/APIError;", "getVibrator", "Landroid/os/Vibrator;", "prepareFilePart", "Lokhttp3/MultipartBody$Part;", "partName", "file", "Ljava/io/File;", "prepareRectF", "Landroid/graphics/RectF;", "location", "removeEXIFFromImage", "imgURI", "outputDirectory", "rotateBitmap", "source", "angle", "", "saveImageToStream", "outputStream", "Ljava/io/OutputStream;", "showAlertDialog", "title", "msg", "positiveButtonText", "trimDoubleToTwoDigitsString", "d", "", "app_dummyDebug"})
public final class HelperFunctions {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.assignment6.util.HelperFunctions INSTANCE = null;
    
    private HelperFunctions() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppVersion(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void showAlertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.String positiveButtonText) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Vibrator getVibrator(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri removeEXIFFromImage(@org.jetbrains.annotations.NotNull()
    android.net.Uri imgURI, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File outputDirectory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.MultipartBody.Part prepareFilePart(@org.jetbrains.annotations.NotNull()
    java.lang.String partName, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.RequestBody createPartFromString(@org.jetbrains.annotations.NotNull()
    java.lang.String descriptionString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGUID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap rotateBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap source, float angle) {
        return null;
    }
    
    private final android.content.ContentValues contentValues() {
        return null;
    }
    
    private final void saveImageToStream(android.graphics.Bitmap bitmap, java.io.OutputStream outputStream) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String createTempImageFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertBitmapToBase64(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String trimDoubleToTwoDigitsString(double d) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.RectF prepareRectF(@org.jetbrains.annotations.NotNull()
    android.graphics.RectF location) {
        return null;
    }
    
    public final void deleteObservationImage(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.assignment6.data.model.APIError getGenericAPIError() {
        return null;
    }
}