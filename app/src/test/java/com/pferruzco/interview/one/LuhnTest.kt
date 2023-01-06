package com.pferruzco.interview.one

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

internal class LuhnTest {

    @Test
    fun `Valid number`() {
        val input = "42"
        val output = validCreditCard(input)

        assertTrue(output)
    }

    @Test
    fun `Invalid number`() {
        val input = "32"
        val output = validCreditCard(input)

        assertFalse(output)
    }

    @Test
    fun `Valid credit card`() {
        val input = "4539 3195 0343 6467"
        val output = validCreditCard(input)

        assertTrue(output)
    }

    @Test
    fun `Invalid credit card`() {
        val input = "8273 1232 7352 0569"
        val output = validCreditCard(input)

        assertFalse(output)
    }
}