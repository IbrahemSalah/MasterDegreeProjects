package com.android.assignment6.util;

import java.lang.System;

/**
 * @version 2009-07-03
 * @author Peli
 * @version 2013-12-11
 * @author paulburke (ipaulpro)
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010%\u001a\u00020&J9\u0010\'\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010\u00062\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010.\u00a2\u0006\u0002\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0006J\u001a\u00101\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+J\u0018\u00102\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0010\u00102\u001a\u0004\u0018\u00010\u00062\u0006\u00103\u001a\u00020\u0017J\u0018\u00104\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0012\u00105\u001a\u0004\u0018\u00010\u00172\b\u00103\u001a\u0004\u0018\u00010\u0017J\u000e\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u000208J\u0018\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J$\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010;\u001a\u0004\u0018\u00010\u0006J\u0018\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010(\u001a\u00020)2\u0006\u00103\u001a\u00020\u0017J\u0012\u0010<\u001a\u0004\u0018\u00010+2\b\u00103\u001a\u0004\u0018\u00010\u0017J\u000e\u0010=\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+J\u000e\u0010>\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+J\u000e\u0010?\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+J\u0010\u0010@\u001a\u00020\u00042\b\u0010A\u001a\u0004\u0018\u00010\u0006J\u000e\u0010B\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+J\u0010\u0010C\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!\u00a8\u0006D"}, d2 = {"Lcom/android/assignment6/util/CustomFileUtils;", "", "()V", "DEBUG", "", "HIDDEN_PREFIX", "", "getHIDDEN_PREFIX", "()Ljava/lang/String;", "MIME_TYPE_APP", "getMIME_TYPE_APP", "MIME_TYPE_AUDIO", "getMIME_TYPE_AUDIO", "MIME_TYPE_IMAGE", "getMIME_TYPE_IMAGE", "MIME_TYPE_TEXT", "getMIME_TYPE_TEXT", "MIME_TYPE_VIDEO", "getMIME_TYPE_VIDEO", "TAG", "getTAG", "sComparator", "Ljava/util/Comparator;", "Ljava/io/File;", "getSComparator", "()Ljava/util/Comparator;", "setSComparator", "(Ljava/util/Comparator;)V", "sDirFilter", "Ljava/io/FileFilter;", "getSDirFilter", "()Ljava/io/FileFilter;", "setSDirFilter", "(Ljava/io/FileFilter;)V", "sFileFilter", "getSFileFilter", "setSFileFilter", "createGetContentIntent", "Landroid/content/Intent;", "getDataColumn", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getExtension", "getFile", "getMimeType", "file", "getPath", "getPathWithoutFilename", "getReadableFileSize", "size", "", "getThumbnail", "Landroid/graphics/Bitmap;", "mimeType", "getUri", "isDownloadsDocument", "isExternalStorageDocument", "isGooglePhotosUri", "isLocal", "url", "isMediaDocument", "isMediaUri", "app_dummyDebug"})
public final class CustomFileUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.android.assignment6.util.CustomFileUtils INSTANCE = null;
    
    /**
     * TAG for log messages.
     */
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "FileUtils";
    private static final boolean DEBUG = false;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MIME_TYPE_AUDIO = "audio/*";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MIME_TYPE_TEXT = "text/*";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MIME_TYPE_IMAGE = "image/*";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MIME_TYPE_VIDEO = "video/*";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MIME_TYPE_APP = "application/*";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HIDDEN_PREFIX = ".";
    
    /**
     * File and folder comparator. TODO Expose sorting option method
     *
     * @author paulburke
     */
    @org.jetbrains.annotations.NotNull
    private static java.util.Comparator<java.io.File> sComparator;
    
    /**
     * File (not directories) filter.
     *
     * @author paulburke
     */
    @org.jetbrains.annotations.NotNull
    private static java.io.FileFilter sFileFilter;
    
    /**
     * Folder (directories) filter.
     *
     * @author paulburke
     */
    @org.jetbrains.annotations.NotNull
    private static java.io.FileFilter sDirFilter;
    
    private CustomFileUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMIME_TYPE_AUDIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMIME_TYPE_TEXT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMIME_TYPE_IMAGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMIME_TYPE_VIDEO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMIME_TYPE_APP() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHIDDEN_PREFIX() {
        return null;
    }
    
    /**
     * Gets the extension of a file name, like ".png" or ".jpg".
     *
     * @param uri
     * @return Extension including the dot("."); "" if there is no extension;
     * null if uri was null.
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getExtension(@org.jetbrains.annotations.Nullable
    java.lang.String uri) {
        return null;
    }
    
    /**
     * @return Whether the URI is a local one.
     */
    public final boolean isLocal(@org.jetbrains.annotations.Nullable
    java.lang.String url) {
        return false;
    }
    
    /**
     * @return True if Uri is a MediaStore Uri.
     * @author paulburke
     */
    public final boolean isMediaUri(@org.jetbrains.annotations.Nullable
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * Convert File into Uri.
     *
     * @param file
     * @return uri
     */
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri getUri(@org.jetbrains.annotations.Nullable
    java.io.File file) {
        return null;
    }
    
    /**
     * Returns the path only (without file name).
     *
     * @param file
     * @return
     */
    @org.jetbrains.annotations.Nullable
    public final java.io.File getPathWithoutFilename(@org.jetbrains.annotations.Nullable
    java.io.File file) {
        return null;
    }
    
    /**
     * @return The MIME type for the given file.
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMimeType(@org.jetbrains.annotations.NotNull
    java.io.File file) {
        return null;
    }
    
    /**
     * @return The MIME type for the give Uri.
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMimeType(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is ExternalStorageProvider.
     * @author paulburke
     */
    public final boolean isExternalStorageDocument(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     * @author paulburke
     */
    public final boolean isDownloadsDocument(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     * @author paulburke
     */
    public final boolean isMediaDocument(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is Google Photos.
     */
    public final boolean isGooglePhotosUri(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * Get the value of the data column for this Uri. This is useful for
     * MediaStore Uris, and other file-based ContentProviders.
     *
     * @param context The context.
     * @param uri The Uri to query.
     * @param selection (Optional) Filter used in the query.
     * @param selectionArgs (Optional) Selection arguments used in the query.
     * @return The value of the _data column, which is typically a file path.
     * @author paulburke
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDataColumn(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.net.Uri uri, @org.jetbrains.annotations.Nullable
    java.lang.String selection, @org.jetbrains.annotations.Nullable
    java.lang.String[] selectionArgs) {
        return null;
    }
    
    /**
     * Get a file path from a Uri. This will get the the path for Storage Access
     * Framework Documents, as well as the _data field for the MediaStore and
     * other file-based ContentProviders.<br></br>
     * <br></br>
     * Callers should check whether the path is local before assuming it
     * represents a local file.
     *
     * @param context The context.
     * @param uri The Uri to query.
     * @see .isLocal
     * @see .getFile
     * @author paulburke
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPath(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * Convert Uri into File, if possible.
     *
     * @return file A local file that the Uri was pointing to, or null if the
     * Uri is unsupported or pointed to a remote resource.
     * @see .getPath
     * @author paulburke
     */
    @org.jetbrains.annotations.Nullable
    public final java.io.File getFile(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * Get the file size in a human-readable string.
     *
     * @param size
     * @return
     * @author paulburke
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReadableFileSize(int size) {
        return null;
    }
    
    /**
     * Attempt to retrieve the thumbnail of given File from the MediaStore. This
     * should not be called on the UI thread.
     *
     * @param context
     * @param file
     * @return
     * @author paulburke
     */
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap getThumbnail(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.io.File file) {
        return null;
    }
    
    /**
     * Attempt to retrieve the thumbnail of given Uri from the MediaStore. This
     * should not be called on the UI thread.
     *
     * @param context
     * @param uri
     * @return
     * @author paulburke
     */
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap getThumbnail(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * Attempt to retrieve the thumbnail of given Uri from the MediaStore. This
     * should not be called on the UI thread.
     *
     * @param context
     * @param uri
     * @param mimeType
     * @return
     * @author paulburke
     */
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap getThumbnail(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.net.Uri uri, @org.jetbrains.annotations.Nullable
    java.lang.String mimeType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Comparator<java.io.File> getSComparator() {
        return null;
    }
    
    public final void setSComparator(@org.jetbrains.annotations.NotNull
    java.util.Comparator<java.io.File> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.io.FileFilter getSFileFilter() {
        return null;
    }
    
    public final void setSFileFilter(@org.jetbrains.annotations.NotNull
    java.io.FileFilter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.io.FileFilter getSDirFilter() {
        return null;
    }
    
    public final void setSDirFilter(@org.jetbrains.annotations.NotNull
    java.io.FileFilter p0) {
    }
    
    /**
     * Get the Intent for selecting content to be used in an Intent Chooser.
     *
     * @return The intent for opening a file with Intent.createChooser()
     * @author paulburke
     */
    @org.jetbrains.annotations.NotNull
    public final android.content.Intent createGetContentIntent() {
        return null;
    }
}