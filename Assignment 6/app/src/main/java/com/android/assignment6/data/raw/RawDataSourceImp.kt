package com.android.assignment6.data.raw

import android.content.Context
import com.google.gson.Gson

class RawDataSourceImp(private val application: Context, private val gson: Gson) : RawDataSource {
    override suspend fun getLocalBaseAppResponse(): ArrayList<String> {
        val trialsLists = arrayListOf<String>()
        val inputStream = application.assets.open("response.json")

        val json = inputStream.bufferedReader().use { it.readText() }

        val trialsObject: ArrayList<String>? = gson.fromJson(json, arrayListOf<String>()::class.java)
        trialsObject?.also { it.let { it1 -> trialsLists.addAll(it1) } }
        return trialsLists
    }
}