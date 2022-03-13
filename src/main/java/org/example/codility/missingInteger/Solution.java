package org.example.codility.missingInteger;

public class Solution {

    public int solution(int[] A) {

        boolean[] existingNumbers = new boolean[100_001];

        for (int i : A) {
            if (i >= 1 && i <= 100_001) {
                existingNumbers[i - 1] = true;
            }
        }

        for (int i = 0; i < existingNumbers.length; i++) {
            if (!existingNumbers[i]) {
                return i + 1;
            }
        }

        return 1;
    }
}
