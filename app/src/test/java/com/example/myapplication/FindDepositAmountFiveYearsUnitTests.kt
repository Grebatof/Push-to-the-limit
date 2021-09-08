package com.example.myapplication

import org.junit.Assert.*
import org.junit.Test

class FindDepositAmountFiveYearsUnitTests {

    @Test
    fun `depositAmount is 10, annualPercentage is 10 return 16,1051`() {
        val result = 10.0.findDepositAmountFiveYears(10.0)
        // 0.1 + 0.1 + 0.1 != 0.3
        // BigDecimal
        assertEquals(16.1051, result)
    }

    @Test
    fun `zero arguments return null`() {
        val result = 0.0.findDepositAmountFiveYears(0.0)

        assertEquals(null, result)
    }

    @Test
    fun `negative arguments return null`() {
        val result = (-3.0).findDepositAmountFiveYears(-4.0)

        assertEquals(null, result)
    }
}