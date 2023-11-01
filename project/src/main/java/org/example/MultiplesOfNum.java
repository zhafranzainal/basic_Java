package org.example;

public class MultiplesOfNum {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 7 == 0) {
                System.out.println(i + ": Ta");
            } else if (i % 9 == 0) {
                System.out.println(i + ": Da");
            } else if (i % 10 == 0) {
                System.out.println(i + ": TaDa");
            }

        }

    }

}
