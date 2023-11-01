package org.example;

import java.util.*;

public class PairNumbers {

    public static void main(String[] args) {
        int[] numbers = {30, 12, 29, 91};
        int count = countPairsWithMatchingDigits(numbers);
        System.out.println("Number of pairs: " + count);
    }

    public static int countPairsWithMatchingDigits(int[] numbers) {

        List<Integer> matchingPairs = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    int num1 = numbers[i];
                    int num2 = numbers[j];
                    int lastDigitNum1 = num1 % 10;
                    int firstDigitNum2 = num2 / 10;

                    if (lastDigitNum1 == firstDigitNum2) {
                        matchingPairs.add(num1);
                        matchingPairs.add(num2);
                    }
                }
            }
        }

        return matchingPairs.size() / 2;
    }

}
