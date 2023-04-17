@file:Suppress("DEPRECATION")

package com.akexorcist.localizationactivity.core

import android.content.res.Configuration
import android.os.Build
import java.util.*

object LocaleParser {
    const val DEFAULT = "en"
    const val EN = "en"
    const val PT = "pt"
    const val ES = "es"

    @JvmStatic
    fun findBestMatchingLocaleForLanguage(language: String?): Locale {
        return if (language == null || language == DEFAULT) {
            //getLocaleFromConfiguration(Resources.getSystem().configuration)
            // changed the default locale to English instead of system local
            Locale(EN)
        } else {
            Locale(language)
        }
    }

    @Suppress("DEPRECATION")
    fun getLocaleFromConfiguration(configuration: Configuration): Locale {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            configuration.locales.get(0)
        } else {
            configuration.locale
        }
    }
}