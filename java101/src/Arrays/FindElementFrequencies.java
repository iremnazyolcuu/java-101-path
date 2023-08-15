package Arrays;

import java.util.Arrays;

public class FindElementFrequencies {
    public static void main(String[] args) {
        int[] numbers = {15, 23, 90, 8, 9, 15, 8, 90, 23, 15};

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Element Frequencies:");

        Arrays.sort(numbers);

        int frequencyCounter = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                for (int j = 0; j < numbers.length; j++) {
                    if ((i != j) && (numbers[i] == numbers[j])) {
                        frequencyCounter++;
                    }
                }
                System.out.println(numbers[i] + " is repeated " + frequencyCounter + " times.");
            } else if (numbers[i] != numbers[i - 1]) {
                for (int j = 0; j < numbers.length; j++) {
                    if ((i != j) && (numbers[i] == numbers[j])) {
                        frequencyCounter++;
                    }
                }
                System.out.println(numbers[i] + " is repeated " + frequencyCounter + " times.");
            }
            frequencyCounter = 1;
        }
    }
}
