package com.akexorcist.localizationactivity.core

import android.content.Context
import android.content.ContextWrapper
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Build
import android.os.LocaleList
import android.util.DisplayMetrics

class LocalizationContext(base: Context) : ContextWrapper(base) {
    override fun getResources(): Resources {
        val locale =
            LocaleParser.findBestMatchingLocaleForLanguage(LanguageSetting.getLanguage(this))

        return when {
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.O -> {
                val configuration = Configuration().apply {
                    setLocales(LocaleList(locale))
                }
                createConfigurationContext(configuration).resources
            }
            else -> {
                val configuration = Configuration().apply {
                    @Suppress("DEPRECATION")
                    this.locale = locale
                }
                val metrics: DisplayMetrics = super.getResources().displayMetrics
                @Suppress("DEPRECATION")
                return Resources(assets, metrics, configuration)
            }
        }
    }
}
