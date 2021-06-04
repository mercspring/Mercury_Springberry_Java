package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setup(){
        //Arrange
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnTheSumOfTheTwoInputs(){
        //Act
        //Assert
        assertEquals(2, calculator.add(1,1));
        assertEquals(8, calculator.add(-808,816));
        assertEquals(0, calculator.add(1,-1));

        assertEquals(2.2, calculator.add(1.1,1.1), 0.02);
        assertEquals(-5.7, calculator.add(-2.1,-3.6), 0.02);
        assertEquals(16.23413, calculator.add(8,8.23413), 0.02);
    }

    @Test
    public void shouldReturnTheDifferenceBetweenTheTwoInputs(){
        //Act
        //Assert
        assertEquals(10, calculator.subtract(20,10));
        assertEquals(-10, calculator.subtract(10,20));
        assertEquals(10, calculator.subtract(17,7));
        assertEquals(855, calculator.subtract(900,45));

        assertEquals(10.1, calculator.subtract(20,9.9), 0.01);
        assertEquals(-99.9, calculator.subtract(-99,.9), 0.01);
        assertEquals(10, calculator.subtract(17.7,7.7), 0.01);
        assertEquals(45, calculator.subtract(90.0,45.0), 0.01);
    }

    @Test
    public void shouldReturnTheQuotiantOfTheTwoInputs(){
        assertEquals(2, calculator.divide(20,10));
        assertEquals(0, calculator.divide(10,20));
        assertEquals(10, calculator.divide(10,1));
        assertEquals(855, calculator.divide(855,1));

        assertEquals(1, calculator.divide(9.9,9.9), 0.01);
        assertEquals(-1.26, calculator.divide(-11.1,8.8), 0.01);
        assertEquals(2.298, calculator.divide(17.7,7.7), 0.01);
        assertEquals(9, calculator.divide(9.9,1.1), 0.01);

    }
    @Test
    public void shouldReturnTheProductOfTheTwoInputs(){

        assertEquals(200, calculator.multiply(20,10));
        assertEquals(200, calculator.multiply(-10,-20));
        assertEquals(0, calculator.multiply(0,15));
        assertEquals(855, calculator.multiply(855,1));

        assertEquals(98.01, calculator.multiply(9.9,9.9), 0.01);
        assertEquals(-97.68, calculator.multiply(-11.1,8.8), 0.01);
        assertEquals(136.29, calculator.multiply(17.7,7.7), 0.01);
        assertEquals(10.89, calculator.multiply(9.9,1.1), 0.01);
    }


}