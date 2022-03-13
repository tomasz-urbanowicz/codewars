package org.example.level8kyu;

import java.util.Arrays;

public class SquareSum {

    public static int squareSum(int[] n) {
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            sum += Math.pow(n[i], 2);
        }

        return sum;
    }

    public static int squareSum2(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += (number * number);
        }
        return sum;
    }

    public static int squareSum3(int[] numbers) {
        return Arrays.stream(numbers).map(x -> x * x).sum();
    }
}
