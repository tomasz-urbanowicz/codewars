package org.example.level8kyu;

import static java.lang.Math.abs;

public class MakeNegative {
    public static int makeNegative(final int x) {
        if (x <= 0){
            return x;
        } else {
            return -1*x;
        }
    }

    public static int makeNegative2(final int x) {
        return x < 0 ? x : -x;
    }

    public static int makeNegative3(final int x) {
        return -abs(x);
    }
//
//    public static int makeNegative4(final int x) {
//
//    }
}
