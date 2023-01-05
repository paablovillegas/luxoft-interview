package com.pferruzco.interview.algorithm

import org.junit.Test

internal class AcronymTest {

    @Test
    fun `Empty string`() {
        val title = ""
        val output = getAcronym(title)

        assert(output.isEmpty())
    }

    @Test
    fun `One word string`() {
        val title = "Title"
        val output = getAcronym(title)
        val expectedOutput = "T"

        assert(output.isNotEmpty())
        assert(output.length == expectedOutput.length)
        assert(output == expectedOutput)
    }

    @Test
    fun `Multiple words string`() {
        val title = "Three Letter Acronyms"
        val output = getAcronym(title)
        val expectedOutput = "TLA"

        assert(output.isNotEmpty())
        assert(output.length == expectedOutput.length)
        assert(output == expectedOutput)
    }
}