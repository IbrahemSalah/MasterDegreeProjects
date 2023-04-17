package com.akexorcist.localizationactivity.core

import android.content.Context
import java.util.*

object LanguageSetting {
    private const val PREFERENCE_LANGUAGE = "pref_language"
    private const val KEY_CURRENT_LANGUAGE = "key_language"

    @JvmStatic
    fun setLanguage(context: Context, locale: Locale) {
        Locale.setDefault(locale)
        setPreference(context, KEY_CURRENT_LANGUAGE, locale.toString())
    }

    @JvmStatic
    fun getLanguage(context: Context): String? =
        getPreference(context, KEY_CURRENT_LANGUAGE, "en")

    private fun setPreference(context: Context, key: String, value: String) {
        context.getSharedPreferences(PREFERENCE_LANGUAGE, Context.MODE_PRIVATE)
            .edit()
            .putString(key, value)
            .apply()
    }

    private fun getPreference(context: Context, key: String, default: String? = null): String? =
        context.getSharedPreferences(PREFERENCE_LANGUAGE, Context.MODE_PRIVATE)
            .getString(key, default)

    @Suppress("unused")
    @JvmStatic
    fun clear(context: Context) {
        context.getSharedPreferences(PREFERENCE_LANGUAGE, Context.MODE_PRIVATE)
            .edit()
            .clear()
            .apply()
    }
}
