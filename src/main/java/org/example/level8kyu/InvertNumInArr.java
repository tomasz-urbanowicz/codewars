package org.example.level8kyu;

import java.util.Arrays;

public class InvertNumInArr {

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * -1;
        }
        return array;
    }

    public static int[] invert2(int[] array) {
        return Arrays.stream(array).map(i -> -i).toArray();
    }

}
