package com.pferruzco.interview.two

import org.junit.Assert.assertEquals
import org.junit.Test

internal class DartGameTest {

    @Test
    fun `Dart out of board`() {
        val coordinates = Pair(-10.0, -10.0)
        val points = calculatePoints(coordinates)
        val expectedResult = 0

        assertEquals(points, expectedResult)
    }

    @Test
    fun `Dart in outer circle`() {
        val coordinates = Pair(5.0, 6.0)
        val points = calculatePoints(coordinates)
        val expectedResult = 1

        assertEquals(points, expectedResult)
    }

    @Test
    fun `Dart in middle circle`() {
        val coordinates = Pair(1.0, -3.0)
        val points = calculatePoints(coordinates)
        val expectedResult = 5

        assertEquals(points, expectedResult)
    }

    @Test
    fun `Dart in inner circle`() {
        val coordinates = Pair(-0.9, 0.4)
        val points = calculatePoints(coordinates)
        val expectedResult = 10

        assertEquals(points, expectedResult)
    }
}