package com.capgemini.junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

public class NumberUtilsTest 
{

    NumberUtils utils = new NumberUtils();

   
    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10, 100})
    void testIsPositive(int number) {
        assertTrue(utils.isPositive(number));
    }

   
    @ParameterizedTest
    @CsvSource({
        "2,4",
        "3,9",
        "4,16",
        "5,25"
    })
    void testSquare(int input, int expected) 
    {
        assertEquals(expected, utils.square(input));
    }

  
    @ParameterizedTest
    @MethodSource("numberProvider")
    void testSquareWithMethodSource(int input, int expected) 
    {
        assertEquals(expected, utils.square(input));
    }

    static Stream<Arguments> numberProvider() 
    {
        return Stream.of(
            Arguments.of(1,1),
            Arguments.of(6,36),
            Arguments.of(7,49)
        );
    }
}