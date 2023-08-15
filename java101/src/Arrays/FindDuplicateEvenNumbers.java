package Arrays;

import java.util.Arrays;

public class FindDuplicateEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {21, 31, 43, 24, 34, 22, 24, 54, 76, -54, 56, 34, 0, 234};

        System.out.println("Array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        int counter = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                int repeatedNumber = numbers[i];
                if (repeatedNumber % 2 == 0) {
                    counter++;
                    System.out.print(repeatedNumber + " ");
                }
            }
        }
        if (counter == 0) {
            System.out.println("No repeated even numbers found!");
        }
    }
}
