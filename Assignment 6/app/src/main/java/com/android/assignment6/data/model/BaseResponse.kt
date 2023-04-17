package com.android.assignment6.data.model

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Keep
data class BaseResponse<T>(
    val statusCode: Int,
    val body: T?,
    val error: APIError?
)


@Keep
@Parcelize
data class APIError(
    @SerializedName("detail")
    val message: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("status")
    val errorCode: Int
) : Parcelable