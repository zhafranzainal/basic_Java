package org.example;

public class BinaryGap {

    public int solution(int N) {

        String binaryN = Integer.toBinaryString(N);

        int maxGap = 0;
        int currentGap = 0;

        for (int i = 0; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '0') {
                currentGap++;
            } else {
                if (currentGap > 0) {
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0;
                }
            }
        }

        return maxGap;
    }

    public static void main(String[] args) {

        BinaryGap binaryGap = new BinaryGap();

        int result = binaryGap.solution(1041);
        System.out.println("Longest Binary Gap: " + result);

    }

}
