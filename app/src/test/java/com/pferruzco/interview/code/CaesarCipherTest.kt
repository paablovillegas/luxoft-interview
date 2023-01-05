package com.pferruzco.interview.code

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

internal class CaesarCipherTest {

    @Test
    fun `Cipher empty string`() {
        val message = ""
        val n = 4
        val output = caesarCipher(message, n)

        assertTrue(output.isEmpty())
    }

    @Test
    fun `Cipher not changing`() {
        val message = "Hello"
        val n = 0
        val output = caesarCipher(message, n)

        assertTrue(output.isNotEmpty())
        assertEquals(output.length, message.length)
        assertEquals(output, message)
    }

    @Test
    fun `Cipher regular change`() {
        val message = "Hello"
        val n = 4
        val output = caesarCipher(message, n)
        val expectedOutput = "Lipps"

        assertTrue(output.isNotEmpty())
        assertEquals(output.length, message.length)
        assertEquals(output, expectedOutput)
    }

    @Test
    fun `Cipher high 'n' change`() {
        val message = "Hello"
        val n = 30
        val output = caesarCipher(message, n)
        val expectedOutput = "Lipps"

        assertTrue(output.isNotEmpty())
        assertEquals(output.length, message.length)
        assertEquals(output, expectedOutput)
    }

    @Test
    fun `Cipher white space included`() {
        val message = "Hello World"
        val n = 4
        val output = caesarCipher(message, n)
        val expectedOutput = "Lipps Asvph"

        assertTrue(output.isNotEmpty())
        assertEquals(output.length, message.length)
        assertEquals(output, expectedOutput)
    }

}