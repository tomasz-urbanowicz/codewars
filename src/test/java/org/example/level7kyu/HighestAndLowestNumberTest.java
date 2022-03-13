package org.example.level7kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestAndLowestNumberTest {

    @Test
    public void test1() {
        assertEquals("42 -9", HighestAndLowestNumber.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}