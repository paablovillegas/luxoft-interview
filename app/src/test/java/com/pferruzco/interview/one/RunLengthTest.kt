package com.pferruzco.interview.one

import org.junit.Assert.assertEquals
import org.junit.Test


internal class RunLengthTest {

    @Test
    fun `Empty input`() {
        val input = ""
        val output = runLength(input)

        assert(output.isEmpty())
    }

    @Test
    fun `No repeated letters in input`() {
        val input = "ABC"
        val output = runLength(input)

        assertEquals(input.length, output.length)
        assertEquals(output, input)
    }

    @Test
    fun `One repeated letter in input`() {
        val input = "AABC"
        val output = runLength(input)
        val expectedOutput = "2ABC"

        assertEquals(output.length, expectedOutput.length)
        assertEquals(output, expectedOutput)
    }

    @Test
    fun `Multiple repeated letters in input 1`() {
        val input = "AABCCCDEEEE"
        val output = runLength(input)
        val expectedOutput = "2AB3CD4E"

        assertEquals(output.length, expectedOutput.length)
        assertEquals(output, expectedOutput)
    }

    @Test
    fun `Multiple repeated letters in input 2`() {
        val input = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"
        val output = runLength(input)
        val expectedOutput = "12WB12W3B24WB"

        assertEquals(output.length, expectedOutput.length)
        assertEquals(output, expectedOutput)
    }
}