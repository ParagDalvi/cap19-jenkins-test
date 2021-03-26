package com.example.cap19

import android.content.Context

class ValidateStringClass {

    fun validateString(context: Context, str: String): Boolean {
        if(context.getString(R.string.app_name) == str)
            return true
        return false
    }

}