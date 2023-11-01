package org.example;

import java.text.DecimalFormat;

public class CalculateFruitBill {

    public static void main(String[] args) {

        String[][] itemArr = {
                {"Durian", "45.50", "50"},
                {"Apple", "5.50", "6"},
                {"Orange", "6.00", "10"},
        };

        calculateAndPrint(itemArr);

    }

    private static void calculateAndPrint(String[][] itemArr) {

        // Define a format with 2 decimal places
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        double grandAmount = 0;
        int grandQuantity = 0;

        for (String[] item : itemArr) {

            String itemName = item[0];
            double itemPrice = Double.parseDouble(item[1]);
            int itemCount = Integer.parseInt(item[2]);

            double itemTotalPrice = itemPrice * itemCount;
            grandAmount += itemTotalPrice;
            grandQuantity += itemCount;

            System.out.printf("You have bought %d %s with total of RM %.2f %n", itemCount, itemName, itemTotalPrice);

        }

        double discountRate = Math.min((grandQuantity / 12) * 0.01, 0.15);
        int discountPercent = (int) (discountRate * 100);

        double grandDiscount = grandAmount * discountRate;
        double finalPrice = grandAmount - grandDiscount;

        System.out.println("Total discount rate : " + discountPercent + "%");
        System.out.println("Total amount paid   : RM " + decimalFormat.format(finalPrice));

    }

}
