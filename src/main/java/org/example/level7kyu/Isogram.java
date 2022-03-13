package org.example.level7kyu;

import java.util.Arrays;

public class Isogram {
    public static boolean isIsogram(String str) throws IllegalAccessException {
        boolean isIsogram = true;

        if (str == null) {
            throw new NullPointerException("Input correct data!");
        }

        if (str.length() == 0) {
            return true;
        }

        char[] chars = str.toLowerCase().toCharArray();


        Arrays.sort(chars);

        System.out.println(Arrays.toString(chars));

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                isIsogram = false;
            }
        }
        return isIsogram;
    }

    public static boolean isIsogramUsingStream(String str) {

        if (str == null) throw new NullPointerException("You haven't provided any text! Please input correct data");
        if (str.length() == 0) {
            return true;
        }
        return str.toLowerCase().chars().distinct().count() == str.length();
    }
}
