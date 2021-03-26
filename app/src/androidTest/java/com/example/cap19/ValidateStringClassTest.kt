package com.example.cap19

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.platform.app.InstrumentationRegistry
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ValidateStringClassTest {

    lateinit var validateStringClass: ValidateStringClass

    @Before
    fun setup() {
        validateStringClass = ValidateStringClass()
    }

    @Test
    fun ifStringDiff_ReturnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val res = validateStringClass.validateString(context, "")
        assertThat(res).isFalse()
    }


    @Test
    fun ifStringSame_ReturnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val res = validateStringClass.validateString(context, "cap19")
        assertThat(res).isTrue()
    }

}