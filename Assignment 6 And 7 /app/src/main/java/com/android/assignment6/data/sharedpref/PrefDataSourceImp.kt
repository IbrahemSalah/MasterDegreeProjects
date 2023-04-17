package com.android.assignment6.data.sharedpref

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.android.assignment6.data.model.BaseAppResponse
import com.google.gson.Gson

class PrefDataSourceImp(private val context: Context) : PrefDataSource {

    private val prefManager: SharedPreferences by lazy {
        val masterKeyAlias = MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()

        EncryptedSharedPreferences.create(
            context,
            "secret_shared_prefs",
            masterKeyAlias,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

    object Constants {
        const val TOKEN_PREF = "pref_token"
        const val BASE_APP_RESPONSE = "base_app_response"
    }

    override fun getToken(): String {
        return getStringPreference(Constants.TOKEN_PREF, "")
    }

    override fun setToken(token: String) {
        setStringPreference(Constants.TOKEN_PREF, token)
    }

    override fun getSharedPrefBaseAppResponse(): BaseAppResponse? {
        val jsonString: String = getStringPreference(Constants.BASE_APP_RESPONSE, "")
        if (jsonString.isNotEmpty())
            return Gson().fromJson(jsonString, BaseAppResponse::class.java)
        else
            return null
    }

    override fun setSharedPrefBaseAppResponse(baseAppResponse: BaseAppResponse) {
        val json: String = Gson().toJson(baseAppResponse)
        setStringPreference(Constants.BASE_APP_RESPONSE, json)
    }

    override fun logOut() {
        prefManager.edit().clear().apply()
    }

    private fun setBooleanPreference(key: String, value: Boolean) {
        prefManager.edit().putBoolean(key, value)
            .apply()
    }

    private fun getBooleanPreference(key: String, defaultValue: Boolean): Boolean {
        return prefManager
            .getBoolean(key, defaultValue)
    }

    private fun setStringPreference(key: String, value: String) {
        prefManager.edit().putString(key, value)
            .apply()
    }

    private fun getStringPreference(key: String, defaultValue: String): String {
        return prefManager
            .getString(key, defaultValue) ?: ""
    }

    private fun getIntegerPreference(key: String, defaultValue: Int): Int {
        return prefManager.getInt(key, defaultValue)
    }

    private fun setIntegerPreference(key: String, value: Int) {
        prefManager.edit().putInt(key, value).apply()
    }

    private fun setLongPreference(key: String, value: Long) {
        prefManager.edit().putLong(key, value).apply()
    }

    private fun getLongPreference(key: String, defaultValue: Long): Long {
        return prefManager.getLong(key, defaultValue)
    }

}