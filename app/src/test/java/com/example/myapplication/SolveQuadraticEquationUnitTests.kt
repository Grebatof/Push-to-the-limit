package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class SolveQuadraticEquationUnitTests {

    @Test
    fun `zero parameters return empty list`() {
        val result = solveQuadraticEquation(0.0, 0.0, -5.0)
        val emptyList = mutableListOf<Double>()

        assertEquals(emptyList, result)
    }

    @Test
    fun `zero variable parameters return empty list`() {
        val result = solveQuadraticEquation(0.0, 0.0, 0.0)
        val emptyList = mutableListOf<Double>()

        assertEquals(emptyList, result)
    }

    @Test
    fun `zero square variable parameter and nonzero variable return singleton list`() {
        val result = solveQuadraticEquation(0.0, 1.0, 0.0)
        val oneElementList = mutableListOf(0.0)

        assertEquals(oneElementList.size, result.size)
    }

    @Test
    fun `square variable is 0, variable is 1, constant is -5 return 5`() {
        val result = solveQuadraticEquation(0.0, 1.0, -5.0)
        val oneElementList = mutableListOf(5.0)

        assertEquals(oneElementList, result)
    }

    @Test
    fun `square variable is 3, variable is -4, constant is -15 return (-1,6666666666666667 3,0)`() {
        val result = solveQuadraticEquation(3.0, -4.0, -15.0)
        val twoElementsList = mutableListOf(-5.0/3.0, 3.0)

        assertEquals(twoElementsList, result)
    }
}
