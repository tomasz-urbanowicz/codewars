package org.example.level7kyu;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char c : str.toCharArray()) {
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        }
        return vowelsCount;
    }

    public static int getCount1(String str) {
        int vowelsCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] chars = str.toLowerCase().toCharArray();

        for (char aChar : chars) {
            for (char vowel : vowels) {
                if (aChar == vowel) {
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;
    }

    public static int getCount2(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    public static int getCount4(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

}

