package com.akexorcist.localizationactivity.core

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Build
import android.os.LocaleList
import java.util.*

open class LocalizationActivityDelegate(private val activity: Activity) {
    private var isLocalizationChanged = false
    private lateinit var currentLanguage: Locale
    private val localeChangedListeners = ArrayList<OnLocaleChangedListener>()

    companion object {
        private const val KEY_ACTIVITY_LOCALE_CHANGED = "activity_locale_changed"
    }

    fun onCreate() {
        setupLanguage()
        checkBeforeLocaleChanging()
    }

    // If activity is run to back stack. So we have to check if this activity is resume working.
    fun onResume(context: Context) {
        checkLocaleChange(context)
        checkAfterLocaleChanging()
    }


    fun updateConfigurationLocale(context: Context): Configuration {
        val locale =
            LocaleParser.findBestMatchingLocaleForLanguage(LanguageSetting.getLanguage(context))
        return Configuration().apply {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val localeList = LocaleList(locale)
                LocaleList.setDefault(localeList)
                setLocale(locale)
                setLocales(localeList)
            } else
                setLocale(locale)
        }
    }

    fun getApplicationContext(applicationContext: Context): Context {
        return LocalizationUtility.applyLocalizationContext(applicationContext)
    }

    fun getResources(resources: Resources): Resources {
        val locale = LocaleParser.findBestMatchingLocaleForLanguage(
            LanguageSetting.getLanguage(activity)
        )
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val localeList = LocaleList(locale)
            LocaleList.setDefault(localeList)
            val config = Configuration().apply {
                setLocale(locale)
                setLocales(localeList)
                setLayoutDirection(locale)
            }
            activity.createConfigurationContext(config).resources
        } else {
            val config = Configuration().apply {
                @Suppress("DEPRECATION")
                this.locale = locale
                setLayoutDirection(locale)
            }
            @Suppress("DEPRECATION")
            resources.updateConfiguration(config, resources.displayMetrics)
            resources
        }
    }

    // Provide method to set application language by country name.
    fun setLanguage(context: Context, newLanguage: String) {
        val locale = Locale(newLanguage)
        setLanguage(context, locale)
    }


    private fun setLanguage(context: Context, newLocale: Locale) {
        val oldLocale =
            LocaleParser.findBestMatchingLocaleForLanguage(LanguageSetting.getLanguage(context))

        if (!isCurrentLanguageSetting(newLocale, oldLocale)) {
            LanguageSetting.setLanguage(activity, newLocale)
            notifyLanguageChanged()
        }
    }

    // Get current language
    fun getLanguage(context: Context): Locale {
        return LocaleParser.findBestMatchingLocaleForLanguage(
            LanguageSetting.getLanguage(
                context
            )
        )
    }

    // Check that bundle come from locale change.
    // If yes, bundle will be remove and set boolean flag to "true".
    private fun checkBeforeLocaleChanging() {
        val isLocalizationChanged =
            activity.intent?.getBooleanExtra(KEY_ACTIVITY_LOCALE_CHANGED, false) ?: false
        if (isLocalizationChanged) {
            this.isLocalizationChanged = true
            activity.intent?.removeExtra(KEY_ACTIVITY_LOCALE_CHANGED)
        }
    }

    // Setup language to locale and language preference.
    // This method will called before onCreate.
    private fun setupLanguage() {
        LanguageSetting.getLanguage(activity)?.let { language ->
            currentLanguage =
                LocaleParser.findBestMatchingLocaleForLanguage(language)
        } ?: run {
            checkLocaleChange(activity)
        }
    }

    // Avoid duplicated setup
    private fun isCurrentLanguageSetting(newLocale: Locale, currentLocale: Locale): Boolean {
        return newLocale.toString() == currentLocale.toString()
    }

    // Let's take it change! (Using recreate method that available on API 11 or more.
    private fun notifyLanguageChanged() {
        sendOnBeforeLocaleChangedEvent()
        if (activity.intent == null)
            activity.intent = Intent()

        activity.intent.putExtra(KEY_ACTIVITY_LOCALE_CHANGED, true)
        activity.recreate()
    }

    // Check if locale has change while this activity was run to back stack.
    private fun checkLocaleChange(context: Context) {
        val oldLanguage =
            LocaleParser.findBestMatchingLocaleForLanguage(LanguageSetting.getLanguage(context))

        if (!isCurrentLanguageSetting(currentLanguage, oldLanguage)) {
            isLocalizationChanged = true
            notifyLanguageChanged()
        }
    }

    // Call override method if local is really changed
    private fun checkAfterLocaleChanging() {
        if (isLocalizationChanged) {
            sendOnAfterLocaleChangedEvent()
            isLocalizationChanged = false
        }
    }

    private fun sendOnBeforeLocaleChangedEvent() {
        for (changedListener in localeChangedListeners) {
            changedListener.onBeforeLocaleChanged()
        }
    }

    private fun sendOnAfterLocaleChangedEvent() {
        for (listener in localeChangedListeners) {
            listener.onAfterLocaleChanged()
        }
    }
}