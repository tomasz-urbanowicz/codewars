package org.example.level7kyu;

//You are going to be given a word. Your job is to return the middle character of the word.
// If the word's length is odd, return the middle character. If the word's length is even,
// return the middle 2 characters.

public class MiddleChar {

    public static String getMiddle(String word) {
        int position = 0;
        int length = 0;

        if (word.length() % 2 == 0) {
            position = word.length() / 2 - 1;
            length = 2;
        } else {
            position = word.length() / 2;
            length = 1;
        }

        return word.substring(position, position + length);
    }

    public static String getMiddle2(String word) {
        String result = "";
        int length = word.length();
        int halfWord = length / 2;

        if (length % 2 == 0) {
            result = word.substring(halfWord - 1, halfWord + 1);
        } else {
            result = word.substring(halfWord, halfWord + 1);
        }
        return result;
    }

    public static String getMiddle3(String word) {
        int length = word.length();

        return (length % 2 != 0) ? String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
    }


}
