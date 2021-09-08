package com.example.myapplication

import org.junit.Assert.*
import org.junit.Test

class DeleteElementsFromArray {

    @Test
    fun `removing from this array all even numbers and all numbers that are not divisible by three`() {
        val numbers: MutableList<Int> = mutableListOf()
        for(i in -10..89) {
            numbers.add(i)
        }

        val result = numbers.filterIndexed { _, i -> parity(i) && divisibilityByThree(i)}

        val expectedNumbers: MutableList<Int> = mutableListOf(-6, 0, 6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, 78, 84)

        assertEquals(expectedNumbers, result)
    }
}