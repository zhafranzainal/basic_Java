package org.example;

public class AppendString {

    public String solution(int[] A) {

        StringBuilder result = new StringBuilder();

        for (int num : A) {

            if (num < 0) {
                result.append('<');
            } else if (num > 0) {
                result.append('>');
            } else {
                result.append('=');
            }

        }

        return result.toString();

    }

    public static void main(String[] args) {

        int[] A = {1, 2, 0, -3};

        AppendString solutionInstance = new AppendString();
        String result = solutionInstance.solution(A);

        System.out.println("\nResult: " + result);

    }

}
