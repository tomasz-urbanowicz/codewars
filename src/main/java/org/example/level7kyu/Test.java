package org.example.level7kyu;

public class Test {

    public static String specialNumber2(int number) {
        while (number > 0) {
            int mod = number % 10;
            if (mod % 10 < 0 || mod % 10 > 5) {
                return "NOT!!";
            }
            number /= 10;
        }
        return "Special!!";
    }

    public static String specialNumber(int number) {
        return String.valueOf(number).matches("[0-5]+") ? "Special!!" : "NOT!!";
        // return ("" + number).matches("[0-5]+") ? "Special!!" : "NOT!!";
    }

    public static String specialNumber3(int number) {
        return String.valueOf(number).replaceAll("[0-5]", "").isEmpty() ? "Special!!" : "NOT!!";
    }

}
