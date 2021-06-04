package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class ConvertIfTest {
    @Test
    public void shouldReturnMonthWhenGivenTheMonthsNumber(){
        //Arrange
        ConvertIf convertIf = new ConvertIf();
        //Act
        //Assert
        assertEquals("January", convertIf.convertMonth(1));
        assertEquals("April", convertIf.convertMonth(4));
        assertEquals("November", convertIf.convertMonth(11));
        assertEquals("December", convertIf.convertMonth(12));
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMonthNotBetweenOneandTwelve(){
        //Arrange
        ConvertIf convertIf = new ConvertIf();
        //Act
        //Assert
        convertIf.convertMonth(-1);
    }
    @Test
    public void shouldReturnDayOfWeekFromAnInteger(){
        //Arrange
        ConvertIf convertIf = new ConvertIf();
        //Act
        //Assert
        assertEquals("Friday", convertIf.convertDay(6));
        assertEquals("Sunday", convertIf.convertDay(1));
        assertEquals("Saturday", convertIf.convertDay(7));
        assertEquals("Tuesday", convertIf.convertDay(3));
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExcpetionIfDayOfWeekNotBetweenOneAndSeven(){
        //Arrange
        ConvertIf convertIf = new ConvertIf();
        //Act
        //Assert
        convertIf.convertDay(100);
        convertIf.convertDay(1);
        convertIf.convertDay(8);
        convertIf.convertDay(20);
        convertIf.convertDay(80);
        convertIf.convertDay(-7);

    }
}