package com.akexorcist.localizationactivity.core

import android.content.Context

class LocalizationApplicationDelegate {

    fun onConfigurationChanged(context: Context) =
        LocalizationUtility.applyLocalizationContext(context)

    fun attachBaseContext(context: Context): Context =
        LocalizationUtility.applyLocalizationContext(context)

    fun getApplicationContext(applicationContext: Context): Context =
        LocalizationUtility.applyLocalizationContext(applicationContext)

}
