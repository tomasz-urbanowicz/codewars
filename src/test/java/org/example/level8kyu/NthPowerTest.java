package org.example.level8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthPowerTest {

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerException() {
        NthPower.nthPower(null, 2);
    }

    @Test
    public void basicTests() {
        assertEquals(-1, NthPower.nthPower(new int[]{1, 2}, 2));
        assertEquals(8, NthPower.nthPower(new int[]{3, 1, 2, 2}, 3));
        assertEquals(4, NthPower.nthPower(new int[]{3, 1, 2}, 2));
        assertEquals(1, NthPower.nthPower(new int[]{3}, 0));
    }

}