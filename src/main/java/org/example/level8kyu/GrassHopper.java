package org.example.level8kyu;

public class GrassHopper {

    public static int summation2(int n) {
        if (n < 0) throw new IllegalArgumentException();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static int summation(int n) {
        return n * (n + 1) / 2;
    }
}
