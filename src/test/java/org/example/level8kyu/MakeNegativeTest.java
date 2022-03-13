package org.example.level8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, MakeNegative.makeNegative(42));
        assertEquals(-42, MakeNegative.makeNegative(-42));
        assertEquals(0, MakeNegative.makeNegative(0));
    }

}