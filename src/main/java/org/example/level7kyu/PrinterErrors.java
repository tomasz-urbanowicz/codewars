package org.example.level7kyu;

public class PrinterErrors {

    public static String printerError(String str) {
        char[] chars = str.toCharArray();
        int errorCounter = 0;
        for (char c : chars) {
            if (c < 97 || c > 109) {
                errorCounter++;
            }
        }
        return errorCounter + "/" + chars.length;
    }

    public static String printError2(String str) {
        return str.replaceAll("[a-m]", "").length() + "/" + str.length();
    }

    public static String printError3(String str) {
        return str.chars().filter(c -> c > 'm').count() + "/" + str.length();
    }
}
