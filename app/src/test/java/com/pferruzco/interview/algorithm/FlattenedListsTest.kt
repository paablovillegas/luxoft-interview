package com.pferruzco.interview.algorithm

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

internal class FlattenedListsTest {

    @Test
    fun `Flattened list empty`(){
        val input: List<List<Int?>> = listOf()
        val output = flattenedList(input)

        assertTrue(output.isEmpty())
    }

    @Test
    fun `Flattened list null elements`(){
        val input: List<List<Int?>> = listOf(
            listOf(null),
            listOf(null, null),
        )
        val output = flattenedList(input)

        assertTrue(output.isEmpty())
    }

    @Test
    fun `Flattened list not null elements`(){
        val input: List<List<Int?>> = listOf(
            listOf(1),
            listOf(2, 3, 4),
            listOf(5, 6),
        )
        val expectedResult = intArrayOf(1, 2, 3, 4, 5, 6)
        val output = flattenedList(input)

        assertTrue(output.isNotEmpty())
        assertEquals(output.size, expectedResult.size)
        assertArrayEquals(output, expectedResult)
    }

    @Test
    fun `Flattened list some null elements`(){
        val input: List<List<Int?>> = listOf(
            listOf(1),
            listOf(2, null, 3, 4),
            listOf(5, 6),
            listOf(null, null)
        )
        val expectedResult = intArrayOf(1, 2, 3, 4, 5, 6)
        val output = flattenedList(input)

        assertTrue(output.isNotEmpty())
        assertEquals(output.size, 6)
        assertArrayEquals(output, expectedResult)
    }
}