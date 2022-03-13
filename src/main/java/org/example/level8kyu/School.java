package org.example.level8kyu;

import java.util.Arrays;

public class School {
    public static int getAverage(int[] marks) {
        double sumOfMarks = 0;

        for (int mark : marks) {
            sumOfMarks += mark;
        }

        int result = (int) sumOfMarks / marks.length;
        return result;
    }

    public static int getAverageUsingStreams1(int[] marks) {
        return (int) Arrays.stream(marks).average().orElse(Double.NaN);
    }

    public static int getAverageUsingStreams2(int[] marks) {
        return (int) Arrays.stream(marks).sum() / marks.length;
    }

}