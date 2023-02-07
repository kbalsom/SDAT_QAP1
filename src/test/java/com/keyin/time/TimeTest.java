//QAP 1 - Software Design, Architecture, and Testing
//Written By: Kara Balsom
//Date Written: February 3, 2023

package com.keyin.time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {

    //Test for nextSecond() method.
    @Test
    public void testNextSecond() {
        Time timeToIncrease = new Time(21,15, 15);

        timeToIncrease.nextSecond();

        Assertions.assertTrue(timeToIncrease.getSecond() == 16);
        System.out.println("Time : " + timeToIncrease);
    }

    //Test for the if/else statements in the nextSecond() method that cause the minute to increase if the second is 59.
    @Test
    public void testNextSecondMinuteIncrease() {
        Time minuteToIncrease = new Time(21,15, 59);

        minuteToIncrease.nextSecond();

        Assertions.assertTrue(minuteToIncrease.getMinute() == 16);
        System.out.println("Time : " + minuteToIncrease);
    }

    //Test for the if/else statements in the nextSecond() method that cause the hour to increase if the minute and second are both 59.
    @Test
    public void testNextSecondHourIncrease() {
        Time hourToIncrease = new Time(21,59, 59);

        hourToIncrease.nextSecond();

        Assertions.assertTrue(hourToIncrease.getHour() == 22);
        System.out.println("Time : " + hourToIncrease);
    }

    //Test for previousSecond() method.
    @Test
    public void testPreviousSecond() {
        Time timeToDecrease = new Time(21,15, 15);

        timeToDecrease.previousSecond();

        Assertions.assertTrue(timeToDecrease.getSecond() == 14);
        System.out.println("Time : " + timeToDecrease);
    }

    //Test for the if/else statements in the previousSecond() method that cause the minute to decrease if the second is 00.
    @Test
    public void testPreviousSecondMinuteDecrease() {
        Time minuteToDecrease = new Time(21,15, 00);

        minuteToDecrease.previousSecond();

        Assertions.assertTrue(minuteToDecrease.getMinute() == 14);
        System.out.println("Time : " + minuteToDecrease);
    }

    //Test for the if/else statements in the previousSecond() method that cause the hour to decrease if the minute and second are both 00.
    @Test
    public void testPreviousSecondHourDecrease() {
        Time hourToDecrease = new Time(21,00, 00);

        hourToDecrease.previousSecond();

        Assertions.assertTrue(hourToDecrease.getHour() == 20);
        System.out.println("Time : " + hourToDecrease);
    }

    //Test for the toString() method.
    @Test
    public void testToString() {
        Time timeToString = new Time(21, 15, 15);

        String obj1 = timeToString.toString();
        String obj2 = "21:15:15";

        Assertions.assertEquals(obj1, obj2);
    }
}