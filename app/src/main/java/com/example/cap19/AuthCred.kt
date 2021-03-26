package com.example.cap19

object AuthCred {

    fun checkCred(mail: String, pass: String): Boolean {
        if (mail == "" || pass.length < 2) return false
        return true
    }

}