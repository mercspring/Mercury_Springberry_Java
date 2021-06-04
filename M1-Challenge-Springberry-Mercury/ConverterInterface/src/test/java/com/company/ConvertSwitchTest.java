package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertSwitchTest {
    @Test
    public void shouldReturnMonthWhenGivenTheMonthsNumber(){
        //Arange
        ConvertSwitch convertSwitch = new ConvertSwitch();
        //Act
        //Assert
        assertEquals("January", convertSwitch.convertMonth(1));
        assertEquals("April", convertSwitch.convertMonth(4));
        assertEquals("November", convertSwitch.convertMonth(11));
        assertEquals("December", convertSwitch.convertMonth(12));
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMonthNotBetweenOneAndTwelve(){
        ConvertSwitch convertSwitch = new ConvertSwitch();
        convertSwitch.convertMonth(-1);
    }
    @Test
    public void shouldReturnDayOfWeekFromAnInteger(){
        //Arrange
        ConvertSwitch convertSwitch = new ConvertSwitch();
        //Act
        //Assert
        assertEquals("Friday", convertSwitch.convertDay(6));
        assertEquals("Sunday", convertSwitch.convertDay(1));
        assertEquals("Saturday", convertSwitch.convertDay(7));
        assertEquals("Tuesday", convertSwitch.convertDay(3));
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExcpetionIfDayOfWeekNotBetweenOneAndSeven(){
        //Arrange
        ConvertSwitch convertSwitch = new ConvertSwitch();
        //Act
        //Assert
        convertSwitch.convertDay(100);
        convertSwitch.convertDay(1);
        convertSwitch.convertDay(8);
        convertSwitch.convertDay(20);
        convertSwitch.convertDay(80);
        convertSwitch.convertDay(-7);

    }


}