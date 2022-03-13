package org.example.level7kyu;

//accum("abcd") -> "A-Bb-Ccc-Dddd"
//accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//accum("cwAt") -> "C-Ww-Aaa-Tttt"

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {

    public static final String DELIMITER = "-";

    public static String accum(String s) {

        StringBuilder stringBuilder = new StringBuilder("");
        char[] chars = s.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    stringBuilder.append(Character.toUpperCase(chars[i]));
                } else {
                    stringBuilder.append(chars[i]);
                }
            }
            if (i < chars.length - 1) {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }

    public static String accum2(String s) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0) {
                builder.append('-');
            }
            builder.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) {
                builder.append(Character.toLowerCase(c));
            }
            i++;
        }
        return builder.toString();
    }

    public static String accum3(String s) {
        List<String> stringList = IntStream.range(0, s.length())
                .mapToObj(i -> duplicateFirstUpper(s.charAt(i), i + 1))
                .collect(Collectors.toList());

        return String.join(DELIMITER, stringList);

    }

    private static String duplicateFirstUpper(char c, int numberOfAppearances) {
        char upperCase = Character.toUpperCase(c);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(upperCase);

        for (int i = 1; i < numberOfAppearances; i++) {
            stringBuilder.append(Character.toLowerCase(c));
        }
        return stringBuilder.toString();
    }

}
