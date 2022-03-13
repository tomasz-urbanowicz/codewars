package org.example.level7kyu;

public class SpecialNumber {
    public static String specialNumber2(int number) {
        return String.valueOf(number).replaceAll("[0-5]", "").isEmpty() ? "Special!!" : "NOT!!";
    }

    public static String specialNumber3(int number) {
        return String.valueOf(number).matches("[0-5]+") ? "Special!!" : "NOT!!";
    }

    public static String specialNumber(int number) {
        while (number != 0) {
            if (number % 10 > 5) {
                return "NOT!!";
            }
            number /= 10;
        }
        return "Special!!";
    }
}
