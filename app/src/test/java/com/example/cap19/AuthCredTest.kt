package com.example.cap19

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class AuthCredTest {

    @Test
    fun ifMailEmpty_ReturnFalse() {
        val res = AuthCred.checkCred("", "1234")
        assertThat(res).isFalse()
    }

    @Test
    fun ifPasswordLessThanTwo_ReturnFalse() {
        val res = AuthCred.checkCred("asdasd", "")
        assertThat(res).isFalse()
    }

    @Test
    fun ifValid_ReturnTrue() {
        val res = AuthCred.checkCred("asdasda", "1234")
        assertThat(res).isTrue()
    }

}