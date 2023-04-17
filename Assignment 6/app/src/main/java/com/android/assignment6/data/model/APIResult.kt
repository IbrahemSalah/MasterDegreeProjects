package com.android.assignment6.data.model

import androidx.annotation.Keep
import java.io.IOException

@Keep
sealed class APIResult<out T> {
    data class Success<T>(val body: T?) : APIResult<T>()
    data class Failure<T>(val error: APIError?) : APIResult<T>()

    companion object {
        fun <T> success(data: T): APIResult<T> = Success(data)
        fun <T> failure(error: APIError): APIResult<T> = Failure(error)
    }
}

@Keep
sealed class FailureException(open val msg: String?, open val code: Int) :
    IOException(msg) {

    data class ServerException(
        override val msg: String?,
        override val code: Int
    ) : FailureException(msg, code)

    data class InvalidUserException(
        override val msg: String?,
        override val code: Int
    ) : FailureException(msg, code)

    data class NetworkException(
        override val msg: String?,
        override val code: Int
    ) : FailureException(msg, code)

    open class UnknownException(
        override val msg: String?,
        override val code: Int
    ) : FailureException(msg, code)

    open class RevokedAccountException(
        override val msg: String?,
        override val code: Int
    ) : FailureException(msg, code)

    open class FailedToConnectException(
        override val msg: String?,
        override val code: Int
    ) : FailureException(msg, code)
}