package com.android.assignment6.data.model

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
@Entity(tableName = "cereal_table")
data class BaseAppResponse(
    @PrimaryKey(autoGenerate = true)
    val dbId: Long = 0,
    val response:String): Parcelable
