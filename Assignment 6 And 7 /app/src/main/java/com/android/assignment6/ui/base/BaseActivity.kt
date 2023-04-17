package com.android.assignment6.ui.base

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.akexorcist.localizationactivity.core.LocalizationActivityDelegate
import java.util.*


open class BaseActivity : AppCompatActivity() {
    private val localizationDelegate by lazy {
        LocalizationActivityDelegate(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        localizationDelegate.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)

    }


    override fun onResume() {
        super.onResume()
        localizationDelegate.onResume(this)
    }

    override fun attachBaseContext(newBase: Context) {
        applyOverrideConfiguration(localizationDelegate.updateConfigurationLocale(newBase))
        super.attachBaseContext(newBase)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        localizationDelegate.getApplicationContext(this)
    }

    override fun getBaseContext(): Context {
        return localizationDelegate.getApplicationContext(super.getBaseContext())
    }

    override fun getApplicationContext(): Context {
        return localizationDelegate.getApplicationContext(super.getApplicationContext())
    }

    override fun getResources(): Resources {
        return localizationDelegate.getResources(super.getResources())
    }

    fun getCurrentLanguage(): Locale = localizationDelegate.getLanguage(applicationContext)


    fun showRootedDailog()
    {
        val builder = AlertDialog.Builder(this)
        //set title for alert dialog
        builder.setTitle("device is Rooted")
        //set message for alert dialog
        builder.setMessage("this device is rooted so the application will not work")
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        //performing positive action
        builder.setPositiveButton("ok"){dialogInterface, which ->
            finish()
        }
        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}

