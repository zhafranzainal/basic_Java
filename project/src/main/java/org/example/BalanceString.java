package org.example;

public class BalanceString {

    public int solution(String row1, String row2) {

        int N = row1.length();

        int row1R = 0, row1W = 0, row1Q = 0;
        int row2R = 0, row2W = 0, row2Q = 0;

        // Calculate the counts of R, W, and ? in each row
        for (int i = 0; i < N; i++) {

            char c1 = row1.charAt(i);

            if (c1 == 'R') {
                row1R++;
            } else if (c1 == 'W') {
                row1W++;
            } else {
                row1Q++;
            }

            char c2 = row2.charAt(i);

            if (c2 == 'R') {
                row2R++;
            } else if (c2 == 'W') {
                row2W++;
            } else {
                row2Q++;
            }

        }

        // Calculate the imbalance in rows
        int diffR_row = (row1R + row2R) - N;
        int diffW_row = (row1W + row2W) - N;

        if (diffR_row < 0) {
            diffW_row -= diffR_row;
            diffR_row = 0;
        }

        if (diffW_row < 0) {
            diffR_row -= diffW_row;
            diffW_row = 0;
        }

        int diffR_col = 0;
        int diffW_col = 0;

        for (int i = 0; i < N; i++) {

            // Calculate the imbalance in columns
            if (row1.charAt(i) == 'R' && row2.charAt(i) == 'W') {
                diffR_col++;
                diffW_col--;
            } else if (row1.charAt(i) == 'W' && row2.charAt(i) == 'R') {
                diffR_col--;
                diffW_col++;
            }

        }

        if ((diffR_row + diffW_row) != (diffR_col + diffW_col)) {
            return -1;
        }

        return Math.abs(diffR_row) + Math.abs(diffW_row);

    }

    public static void main(String[] args) {

        String row1 = "RR?";
        String row2 = "?R?";

        BalanceString solutionInstance = new BalanceString();
        int result = solutionInstance.solution(row1, row2);

        System.out.println("\nResult: " + result);

    }

}
