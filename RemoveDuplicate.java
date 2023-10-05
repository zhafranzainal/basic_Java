import java.util.HashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6, 5, 5, 5, 5, 5, 8};
        System.out.println("The value is " + removeDuplicate(inputArray));

    }

    private static String removeDuplicate(int[] p) {

        HashSet<Integer> uniqueValues = new HashSet<>();
        StringBuilder resultBuilder = new StringBuilder();

        for (int number : p) {

            if (uniqueValues.add(number)) {

                if (resultBuilder.length() > 0) {
                    resultBuilder.append(", ");
                }

                resultBuilder.append(number);

            }

        }

        return resultBuilder.toString();

    }

}
