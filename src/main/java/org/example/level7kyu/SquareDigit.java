package org.example.level7kyu;

import java.util.List;

public class SquareDigit {

    public int squareDigits(int n) {
        

        return 0;
    }

    private static void collectDigits(int num, List<Integer> digits) {
        if (num / 10 > 0) {
            collectDigits(num / 10, digits);
        }
        digits.add(num % 10);
    }

}