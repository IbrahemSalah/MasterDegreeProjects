package com.example.ibrahemsalah615885assignment3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MIUUser(
    val firstName: String? = null,
    val lastName: String? = null,
    val userName: String,
    val password: String
) : Parcelable {
    override fun equals(other: Any?): Boolean {
        val miuUser = other as MIUUser

        return (this.userName.lowercase() == miuUser.userName.lowercase()
                && this.password.lowercase() == miuUser.password.lowercase())
    }

    override fun hashCode(): Int {
        var result = 1
        result = 31 * result + userName.hashCode()
        result = 31 * result + password.hashCode()
        return result
    }
}
