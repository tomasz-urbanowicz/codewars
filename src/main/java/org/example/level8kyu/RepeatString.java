package org.example.level8kyu;

public class RepeatString {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }
}
