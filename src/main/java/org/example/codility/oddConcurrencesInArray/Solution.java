package org.example.codility.oddConcurrencesInArray;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] A) {
        Set<Integer> integers = new HashSet<>();

        for (int i : A) {
            if (!integers.contains(i)) {
                integers.add(i);
            } else {
                integers.remove(i);
            }
        }
        for (int i : integers) {
            return i;
        }

        return 0;
    }
}
