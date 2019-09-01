package com.example.babysteps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    @Test
    void testFizzBuzzTransformThrowsErrorOnZeroOrNegative() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.transform(0));
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.transform(-1));
    }

    @Test
    void testFizzBuzzTransformReturnsFizzIfDivisibleByThree() {
        assertEquals("Fizz", FizzBuzz.transform(3));
        assertEquals("Fizz", FizzBuzz.transform(6));
        assertEquals("Fizz", FizzBuzz.transform(9));
    }

    @Test
    void testFizzBuzzTransformReturnsBuzzIfDivisibleByFive() {
        assertEquals("Buzz", FizzBuzz.transform(5));
        assertEquals("Buzz", FizzBuzz.transform(10));
    }

    @Test
    void testFizzBuzzTransformReturnsFizzBuzzIfDivisibleByBoth() {
        assertEquals("FizzBuzz", FizzBuzz.transform(3 * 5));
        assertEquals("FizzBuzz", FizzBuzz.transform(30));
    }

    @Test
    void testFizzBuzzTransformStringifiesInputInOtherCases() {
        for (var n: new int[] {1, 2, 4, 7, 8, 11, 13, 14, 16, 31, 32, 34}) {
            assertEquals(String.valueOf(n), FizzBuzz.transform(n));
        }
    }

}