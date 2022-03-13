package org.example.level7kyu;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxMultiple {
    public static int maxMultiple1(int divisor, int bound) {
        int result = 0, i = 0;

        while (i <= bound) {
            if (i % divisor == 0) {
                result = i;
            }
            i++;
        }
        return result;
    }

    public static int maxMultiple2(int divisor, int bound) {
        return bound - (bound % divisor);
    }

    public static int maxMultiple3(int divisor, int bound) {
        return bound / divisor * divisor;
    }

    public static int maxMultiple4(int divisor, int bound) {
        return IntStream
                .rangeClosed(0, bound)
                .filter(e -> e % divisor == 0)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public static int maxMultiple(int divisor, int bound) {
        return Stream.iterate(bound, n -> n - 1).filter(it -> it % divisor == 0).findFirst().orElse(0);
    }
}
