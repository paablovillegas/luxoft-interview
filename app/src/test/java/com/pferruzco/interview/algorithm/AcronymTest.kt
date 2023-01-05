package com.pferruzco.interview.algorithm

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

internal class AcronymTest {

    @Test
    fun `Empty string`() {
        val title = ""
        val output = getAcronym(title)

        assertTrue(output.isEmpty())
    }

    @Test
    fun `One word string`() {
        val title = "Title"
        val output = getAcronym(title)
        val expectedOutput = "T"

        assertTrue(output.isNotEmpty())
        assertEquals(output.length, expectedOutput.length)
        assertEquals(output, expectedOutput)
    }

    @Test
    fun `Multiple words string`() {
        val title = "Three Letter Acronyms"
        val output = getAcronym(title)
        val expectedOutput = "TLA"

        assertTrue(output.isNotEmpty())
        assertEquals(output.length, expectedOutput.length)
        assertEquals(output, expectedOutput)
    }
}