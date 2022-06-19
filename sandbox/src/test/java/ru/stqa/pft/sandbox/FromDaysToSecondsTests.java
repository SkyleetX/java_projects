package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FromDaysToSecondsTests {
    int[] exDays = { 2, 4, 6};
    int[] exSeconds = { 172800, 345600, 518400};

    @Test
    public void testGetSeconds() {
        FromDaysToSeconds seconds = new FromDaysToSeconds(exDays[0]);
        assertEquals(seconds.getSecondsFromDays(), exSeconds[0]);
        System.out.println("Expected: " + exSeconds[0] + ", " + "was: " + seconds.getSecondsFromDays());
    }

    @Test
    public void testGetSeconds2() {
        FromDaysToSeconds seconds = new FromDaysToSeconds(4);
        assertEquals(seconds.getSecondsFromDays(), 345600);
    }

    @Test
    public void testGetSeconds3() {
        FromDaysToSeconds seconds = new FromDaysToSeconds(6);
        assertEquals(seconds.getSecondsFromDays(), 518400);
    }
}
