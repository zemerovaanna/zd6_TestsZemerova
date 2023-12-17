package com.example.zemerovatests

import org.junit.Assert.*
import org.junit.Ignore
import org.junit.Test

class TextValidationTest {

    @Ignore
    fun onlyLetters(text: String): Boolean {
        for (i in text) {
            if (!i.isLetter()) {
                return false
            }
        }
        return true
    }

    @Test
    fun withOnlyLetters() {
        assertTrue(onlyLetters("abcd"))
    }

    @Test
    fun withNonLetters() {
        assertFalse(onlyLetters("abc123"))
    }

    @Test
    fun withEmptyString() {
        assertTrue(onlyLetters(""))
    }
}