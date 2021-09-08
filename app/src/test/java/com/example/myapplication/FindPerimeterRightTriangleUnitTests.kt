package com.example.myapplication

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class FindPerimeterRightTriangleUnitTests {

    @Test
    fun `cathetFirst is 3, cathetSecond is 4 return 12`() {
        val result = findPerimeterRightTriangle(3.0,4.0)

        assertEquals(12.0, result)
    }

    @Test
    fun `zero arguments return null`() {
        val result = findPerimeterRightTriangle(0.0,0.0)

        assertEquals(null, result)
    }

    @Test
    fun `negative arguments return null`() {
        val result = findPerimeterRightTriangle(-3.0,-4.0)

        assertEquals(null, result)
    }
}