package com.android.assignment6.data.offline

import com.android.assignment6.data.model.APIResult

interface Offline {
    fun dummyOffline(): APIResult<String>
}