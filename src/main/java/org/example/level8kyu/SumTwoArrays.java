package org.example.level8kyu;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumTwoArrays {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        int sumArr2 = 0;

        for (int i : arr1) {
            sumArr1 += i;
        }

        for (int i : arr2) {
            sumArr2 += i;
        }

        return sumArr1 + sumArr2;
    }

    public static int arrayPlusArray2(int[] arr1, int[] arr2) {
        int sumArr1 = Arrays.stream(arr1).sum();
        int sumArr2 = Arrays.stream(arr2).sum();

        return sumArr1 + sumArr2;
    }

    public static int arrayPlusArray3(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

    public static int arrayPlusArray4(int[] arr1, int[] arr2) {
        return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).sum();
    }
}
