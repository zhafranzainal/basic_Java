package org.example;

public class IsContainNumber {

    public boolean solution(int[] A, int K) {

        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }

        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;

    }

    public static void main(String[] args) {

        int[] A = {1, 1, 2, 3, 3};
        int K = 3;

//        int[] A = {1, 1, 3};
//        int K = 2;

        IsContainNumber solutionInstance = new IsContainNumber();
        boolean result = solutionInstance.solution(A, K);

        System.out.println("\nResult: " + result);

    }

}
