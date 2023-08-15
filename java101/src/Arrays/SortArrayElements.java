package Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class SortArrayElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int indexArray = input.nextInt();
        int[] numbers = new int[indexArray];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". element: ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

