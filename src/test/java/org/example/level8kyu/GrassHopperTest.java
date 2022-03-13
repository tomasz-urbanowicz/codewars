package org.example.level8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.*/

public class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals(1,
                GrassHopper.summation(1));
    }

    @Test
    public void test2() {
        assertEquals(36,
                GrassHopper.summation(8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        GrassHopper.summation(-2);
    }

}