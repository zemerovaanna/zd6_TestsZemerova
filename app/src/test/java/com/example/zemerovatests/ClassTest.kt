package com.example.zemerovatests

import org.junit.Test
import org.junit.Assert.*

data class Human(val name: String, val age: Int, val height: Int, val weight: Int)

class ClassTest{
    @Test
    fun testCreate(){
        val humanVasya = Human("Vasya", 18, 185, 80)
        assertEquals("Vasya", humanVasya.name)
        assertEquals(18, humanVasya.age)
        assertEquals(185, humanVasya.height)
        assertEquals(80, humanVasya.weight)
    }
}