package com.android.assignment6.util

import android.content.ContentValues
import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.graphics.RectF
import android.net.Uri
import android.os.Vibrator
import android.provider.MediaStore
import android.util.Base64
import androidx.appcompat.app.AlertDialog
import com.android.assignment6.data.model.APIError

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.*
import java.text.DecimalFormat
import java.util.*

object HelperFunctions {

    fun getAppVersion(context: Context): String {
        val packageInfo: PackageInfo
        try {
            packageInfo =
                context.packageManager.getPackageInfo(context.packageName, 0)
        } catch (e: PackageManager.NameNotFoundException) {
            return Constants.APP_VERSION
        }
        return Constants.APP_VERSION + "." + packageInfo.versionName.toString() + " (" + packageInfo.versionCode.toString() + ")"
    }


    fun showAlertDialog(
        context: Context,
        title: String,
        msg: String,
        positiveButtonText: String
    ) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(msg)

        builder.setPositiveButton(positiveButtonText) { _, _ ->
        }

        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }


    fun getVibrator(context: Context): Vibrator {
        return context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }


    fun removeEXIFFromImage(imgURI: Uri, context: Context, outputDirectory: File): Uri {
        URIPathHelper().getPath(context, imgURI)?.let {
            val imageBitMap = BitmapFactory.decodeFile(it)

            val exifPhotoFile = File(
                outputDirectory, "holder_image.jpeg"
            )

            try {
                val fileOutputStream = FileOutputStream(exifPhotoFile)

                fileOutputStream.use { out ->
                    imageBitMap.compress(
                        Bitmap.CompressFormat.JPEG,
                        100,
                        out
                    )
                }
            } catch (e: IOException) {
                e.printStackTrace()
            }
            return Uri.fromFile(exifPhotoFile)
        }
        return imgURI
    }

    fun prepareFilePart(partName: String, file: File): MultipartBody.Part {
        val requestBody: RequestBody = file.asRequestBody("image/*".toMediaTypeOrNull())
        return MultipartBody.Part.createFormData(partName, file.name, requestBody)
    }

    fun createPartFromString(descriptionString: String): RequestBody {
        return descriptionString
            .toRequestBody(MultipartBody.FORM)
    }

    fun getGUID(): String {
        return UUID.randomUUID().toString().toLowerCase()
    }


    fun rotateBitmap(source: Bitmap, angle: Float): Bitmap {
        val matrix = Matrix()
        matrix.postRotate(angle)
        return Bitmap.createBitmap(source, 0, 0, source.width, source.height, matrix, true)
    }


    private fun contentValues(): ContentValues {
        val values = ContentValues()
        values.put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
        values.put(MediaStore.Images.Media.DATE_ADDED, System.currentTimeMillis() / 1000);
        values.put(MediaStore.Images.Media.DATE_TAKEN, System.currentTimeMillis());
        return values
    }

    private fun saveImageToStream(bitmap: Bitmap, outputStream: OutputStream?) {
        if (outputStream != null) {
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
                outputStream.close()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


    fun createTempImageFile(context: Context, bitmap: Bitmap): String {
        var outputDir: File = context.getCacheDir()
        var outputFile: File = File.createTempFile(
            System.currentTimeMillis().toString() + "-temp",
            ".JPEG",
            outputDir
        )
        saveImageToStream(bitmap, FileOutputStream(outputFile))

        return outputFile.path
    }

    fun convertBitmapToBase64(bitmap: Bitmap): String {
        val byteArrayOutputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 20, byteArrayOutputStream)
        val byteArray: ByteArray = byteArrayOutputStream.toByteArray()
        return Base64.encodeToString(byteArray, Base64.DEFAULT)
    }

    fun trimDoubleToTwoDigitsString(d: Double): String {
        val df = DecimalFormat("#.##")
        return df.format(d)
    }

    fun prepareRectF(location: RectF): RectF {
        val Xmin = location.left
        val Ymin = location.top
        val Xmax = location.right
        val Ymax = location.bottom

        val Xcen = (Xmax + Xmin) / 2f
        val Ycen = (Ymax + Ymin) / 2f

        return RectF(
            (Xcen * 640f) - 1,
            (Ycen * 640f) - 1,
            (Xcen * 640f) + 1,
            (Ycen * 640f) + 1
        )
    }

    fun deleteObservationImage(uri: Uri) {
        kotlin.runCatching {
            val file = File(uri.toString())
            file.delete()
        }
    }

    fun getGenericAPIError(): APIError {
        return APIError(
            "Something Went Wrong.",
            "",
            "",
            0
        )
    }

}