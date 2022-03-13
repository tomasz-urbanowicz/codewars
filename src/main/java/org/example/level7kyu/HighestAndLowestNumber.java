package org.example.level7kyu;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class HighestAndLowestNumber {

    public static String highAndLow(String numbers) {
        String[] split = numbers.split(" ");
        String min = split[0];
        String max = split[0];

        System.out.println(Arrays.toString(split));

        for (String s : split) {
            if (Integer.parseInt(s) > Integer.parseInt(max)) max = s;
            if (Integer.parseInt(s) < Integer.parseInt(min)) min = s;
        }
        return max + " " + min;
    }

    public static String highAndLow2(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();
        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }

    public static String highAndLow3(String numbers) {
        IntSummaryStatistics summaryStatistics = Arrays
                .stream(numbers.split(" "))
                .collect(Collectors.summarizingInt(n -> Integer.parseInt(n)));
        return String.format("%d %d", summaryStatistics.getMax(), summaryStatistics.getMin());
    }

    public static String highAndLow4(String numbers) {
        IntSummaryStatistics stats = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt).summaryStatistics();
        return String.format("%d %d", stats.getMax(), stats.getMin());
    }
}
