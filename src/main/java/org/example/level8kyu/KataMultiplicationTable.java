package org.example.level8kyu;

public class KataMultiplicationTable {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            sb.append(i + " * " + num + " = " + result + "\n");
        }
        return sb.toString().trim();
    }
}
