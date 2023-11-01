package org.example;

public class MaxRemoval {

    int solution(String S) {

        int bCount = 0, aCount = 0, nCount = 0;
        int maxRemovals = 0;

        for (char c : S.toCharArray()) {
            if (c == 'B') {
                bCount++;
            } else if (c == 'A') {
                aCount++;
            } else if (c == 'N') {
                nCount++;
            }

            // Check if "BANANA" can be formed
            if (bCount >= 1 && aCount >= 3 && nCount >= 2) {
                maxRemovals++;
                bCount--;
                aCount -= 3;
                nCount -= 2;
            }
        }

        return maxRemovals;

    }

    public static void main(String[] args) {
        MaxRemoval maxRemoval = new MaxRemoval();
        System.out.println(maxRemoval.solution("NAABXXAN"));
        System.out.println(maxRemoval.solution("NAANAAXNABABYNNBZ"));
        System.out.println(maxRemoval.solution("QABAAAWOBL"));
    }
}
