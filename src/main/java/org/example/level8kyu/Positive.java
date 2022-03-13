package org.example.level8kyu;

import java.util.Arrays;

public class Positive {

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(value -> value > 0).sum();
    }

    public static int sum2(int[] arr) {
        int result = 0;
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }

    public static int sum3(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

}
