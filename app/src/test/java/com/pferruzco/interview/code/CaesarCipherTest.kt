package com.pferruzco.interview.code

import org.junit.Test

internal class CaesarCipherTest {

    @Test
    fun `Cipher empty string`() {
        val message = ""
        val n = 4
        val output = caesarCipher(message, n)

        assert(output.isEmpty())
    }

    @Test
    fun `Cipher not changing`() {
        val message = "Hello"
        val n = 0
        val output = caesarCipher(message, n)

        assert(output.isNotEmpty())
        assert(output.length == message.length)
        for (i in output.indices) {
            assert(output[i] == message[i])
        }
    }

    @Test
    fun `Cipher regular change`() {
        val message = "Hello"
        val n = 4
        val output = caesarCipher(message, n)
        val expectedOutput = "Lipps"

        assert(output.isNotEmpty())
        assert(output.length == expectedOutput.length)
        for(i in expectedOutput.indices) {
            assert(output[i] == expectedOutput[i])
        }
    }

    @Test
    fun `Cipher high 'n' change`() {
        val message = "Hello"
        val n = 30
        val output = caesarCipher(message, n)
        val expectedOutput = "Lipps"

        assert(output.isNotEmpty())
        assert(output.length == expectedOutput.length)
        for(i in expectedOutput.indices) {
            assert(output[i] == expectedOutput[i])
        }
    }

    @Test
    fun `Cipher white space included`() {
        val message = "Hello World"
        val n = 4
        val output = caesarCipher(message, n)
        val expectedOutput = "Lipps Asvph"

        assert(output.isNotEmpty())
        assert(output.length == expectedOutput.length)
        for(i in expectedOutput.indices) {
            assert(output[i] == expectedOutput[i])
        }
    }

}