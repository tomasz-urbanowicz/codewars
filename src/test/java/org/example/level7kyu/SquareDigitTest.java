package org.example.level7kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareDigitTest {

    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
//        assertEquals(16258149, new SquareDigit().squareDigits(4597));
        assertEquals(92514, new SquareDigit().squareDigits(3512));
        assertEquals(8181641, new SquareDigit().squareDigits(9981));
    }

}


/*
9 = 811181
1 =
1 =
9 =
 */