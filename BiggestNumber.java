public class BiggestNumber {

    public static void main(String[] args) {

        int num[] = {5, 34, 78, 2, 45, 1, 98, 23, 97, -45};
        printTwoBiggestNumbers(num);

    }

    private static void printTwoBiggestNumbers(int[] n) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : n) {

            if (number > firstMax) {
                secondMax = firstMax;
                firstMax = number;
            } else if (number > secondMax) {
                secondMax = number;
            }

        }

        System.out.println("First Biggest Number    : " + firstMax);
        System.out.println("Second Biggest Number   : " + secondMax);

    }

}
