package org.example;

public class SmallestInteger {

    public int solution(int[] A) {

        int n = A.length;
        boolean[] seen = new boolean[n + 1];

        for (int value : A) {
            if (value > 0 && value <= n) {
                seen[value] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                return i;
            }
        }

        return n + 1;

    }

    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};

        SmallestInteger solutionInstance = new SmallestInteger();
        int result = solutionInstance.solution(A);

        System.out.println("Smallest positive integer not in the array: " + result);

    }

}
