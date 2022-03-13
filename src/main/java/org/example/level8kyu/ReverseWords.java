package org.example.level8kyu;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String reverseWords(String str) {
        String[] split = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i] + " ");
        }

        return sb.toString().trim();
    }

    public static String reverseWord2(String string) {
        Object[] array;
        List words = Arrays.asList(string.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    public static String reverseWord3(String string) {
        return StringUtils.reverseDelimited(string, ' ');
    }
}