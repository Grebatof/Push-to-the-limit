package com.example.myapplication

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class FindHypotenuseUnitTests {

    @Test
    fun `cathetFirst is 3, cathetSecond is 4 return 5`() {
        val result = findHypotenuse(3.0,4.0)

        assertEquals(5.0, result)
    }

    @Test
    fun `zero arguments return null`() {
        val result = findHypotenuse(0.0,0.0)

        assertEquals(null, result)
    }

    @Test
    fun `negative arguments return null`() {
        val result = findHypotenuse(-3.0,-4.0)

        assertEquals(null, result)
    }
}
