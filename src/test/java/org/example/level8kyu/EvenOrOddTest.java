package org.example.level8kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals(eoo.even_or_odd(6), "Even");
        assertEquals(eoo.even_or_odd(7), "Odd");
    }

}