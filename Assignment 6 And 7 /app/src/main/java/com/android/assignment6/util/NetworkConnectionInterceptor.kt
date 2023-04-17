package com.android.assignment6.util

import android.content.Context
import com.akexorcist.localizationactivity.core.LanguageSetting
import com.akexorcist.localizationactivity.core.LocaleParser
import com.android.assignment6.data.SessionManager
import com.android.assignment6.data.repositories.Repository
import kotlinx.coroutines.runBlocking
import okhttp3.Interceptor
import okhttp3.Response
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import java.util.*

class NetworkConnectionInterceptor(
    private val context: Context,
    private val network: NetworkHelper
) : Interceptor, KoinComponent {
    val sessionManager: SessionManager by inject()
    val repository: Repository by inject()

    // Get current language
    fun getLanguage(context: Context): Locale {
        return LocaleParser.findBestMatchingLocaleForLanguage(
            LanguageSetting.getLanguage(
                context
            )
        )
    }

    fun getcurrentlangauge(): String {
        when (getLanguage(context).language) {
            LocaleParser.EN -> {
                return "en"
            }
            LocaleParser.PT -> {
                return "pt"
            }
            LocaleParser.ES -> {
                return "es"
            }
            else -> return "en"
        }
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val newBuilder = chain.request().newBuilder()

        runBlocking {
            val accessToken = sessionManager.current()
            accessToken?.let {
                newBuilder.addHeader("Authorization", "${accessToken}")
                newBuilder.addHeader("App-Version", HelperFunctions.getAppVersion(context))
                newBuilder.addHeader("Accept-Language", getcurrentlangauge())
            }
        }
        return chain.proceed(newBuilder.build())
    }
}