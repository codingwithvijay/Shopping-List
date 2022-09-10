package com.theandroidcafe.shoppinglist.util

import android.util.Log
import androidx.fragment.app.Fragment
import com.theandroidcafe.shoppinglist.BuildConfig


fun Fragment.logMe(message: String) {
    if (BuildConfig.DEBUG) Log.d(this::class.java.simpleName, message)
}