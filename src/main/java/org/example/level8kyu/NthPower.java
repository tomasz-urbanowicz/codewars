package org.example.level8kyu;

public class NthPower {

    public static int nthPower(int[] array, int n) {
        if (array == null) {
            throw new NullPointerException("The array has not been created! Please provide correct data");
        }
        if (n >= array.length) {
            return -1;
        }

        return (int) Math.pow(array[n], n);
    }
}

