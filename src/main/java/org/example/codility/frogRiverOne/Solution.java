package org.example.codility.frogRiverOne;

public class Solution {

    public int solution(int X, int[] A) {
        int max = 0;
        int[] alreadyFallen = new int[A.length];
        for (int i = 0; i < alreadyFallen.length; i++) {
            alreadyFallen[i] = -1;
        }

        for (int i = 0; i < A.length; i++) {
            int position = A[i];

            if (position - 1 < alreadyFallen.length && alreadyFallen[position - 1] == -1) {
                alreadyFallen[position - 1] = i;
            }

            if (A[i] > max) {
                max = A[i];
            }
        }

        int latestLeaf = 0;

        for (int i = 0; i < X; i++) {
            if (alreadyFallen[i] >= 0) {
                if (alreadyFallen[i] > latestLeaf) {
                    latestLeaf = alreadyFallen[i];
                }
            } else {
                return -1;
            }
        }
        if (max == 0) {
            return -1;
        }
        return latestLeaf;
    }
}
