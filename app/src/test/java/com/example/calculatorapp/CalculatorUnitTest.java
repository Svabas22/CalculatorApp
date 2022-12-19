package com.example.calculatorapp;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorUnitTest {

    @Test
    public void Given_Values_When_additionIsCalled_Then_ReturnedValue(){
        final double givenDouble1 = 1;
        final double givenDouble2 = 2;

        final double expectedResult = 3;
        final double actualResult = Calculator.addition(givenDouble1, givenDouble2);

        assertEquals(String.valueOf(expectedResult), String.valueOf(actualResult));
    }
    @Test
    public void Given_Values_When_subtractionIsCalled_Then_ReturnedValue(){
        final double givenDouble1 = 3;
        final double givenDouble2 = 2;

        final double expectedResult = 1;
        final double actualResult = Calculator.subtraction(givenDouble1, givenDouble2);

        assertEquals(String.valueOf(expectedResult), String.valueOf(actualResult));
    }
    @Test
    public void Given_Values_When_multiplicationIsCalled_Then_ReturnedValue(){
        final double givenDouble1 = 2;
        final double givenDouble2 = 3;

        final double expectedResult = 6;
        final double actualResult = Calculator.multiplication(givenDouble1, givenDouble2);

        assertEquals(String.valueOf(expectedResult), String.valueOf(actualResult));
    }
    @Test
    public void Given_Values_When_divisionIsCalled_Then_ReturnedValue(){
        final double givenDouble1 = 6;
        final double givenDouble2 = 2;

        final double expectedResult = 3;
        final double actualResult = Calculator.division(givenDouble1, givenDouble2);

        assertEquals(String.valueOf(expectedResult), String.valueOf(actualResult));
    }
    @Test
    public void Given_Values_When_modulusIsCalled_Then_ReturnedValue(){
        final double givenDouble1 = 11;
        final double givenDouble2 = 5;

        final double expectedResult = 1;
        final double actualResult = Calculator.modulus(givenDouble1, givenDouble2);

        assertEquals(String.valueOf(expectedResult), String.valueOf(actualResult));
    }
}
