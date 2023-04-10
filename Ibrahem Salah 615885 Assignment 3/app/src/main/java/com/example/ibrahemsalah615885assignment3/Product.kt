package com.example.ibrahemsalah615885assignment3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Product(
    val title: String,
    val price: Double,
    val itemId: String,
    val imageUrl: String,
    val desc: String
) : Parcelable