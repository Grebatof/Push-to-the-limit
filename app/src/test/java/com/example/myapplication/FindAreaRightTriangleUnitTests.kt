package com.example.myapplication

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class FindAreaRightTriangleUnitTests {

    @Test
    fun `cathetFirst is 3, cathetSecond is 4 return 6`() {
        val result = findAreaRightTriangle(3.0,4.0)

        assertEquals(6.0, result)
    }

    @Test
    fun `zero arguments return null`() {
        val result = findAreaRightTriangle(0.0,0.0)

        assertEquals(null, result)
    }

    @Test
    fun `negative arguments return null`() {
        val result = findAreaRightTriangle(-3.0,-4.0)

        assertEquals(null, result)
    }
}