package org.example.level7kyu;

public class BalancedNumber {


    public static String balancedNum(long number) {
        String numberToString = String.valueOf(number);
        if (number < 100) {
            return "Balanced";
        }
        String leftPart;
        String rightPart = numberToString.substring(numberToString.length() / 2 + 1);

        if (numberToString.length() % 2 == 0) {
            leftPart = numberToString.substring(0, (numberToString.length() / 2 - 1));
        } else {
            leftPart = numberToString.substring(0, (numberToString.length() / 2));
        }
        if (leftPart.chars().sum() == rightPart.chars().sum()) {
            return "Balanced";
        } else {
            return "Not Balanced";
        }
    }
}
