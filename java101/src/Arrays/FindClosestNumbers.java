package Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class FindClosestNumbers {
    public static void main(String[] args) {

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println("Array: " + Arrays.toString(arr));

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = inp.nextInt();

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > number) {
                max = arr[i];
                break;
            } else if (arr[i] < number) {
                min = arr[i];
            }
        }

        System.out.println("Nearest smallest number to the entered number: " + min);
        System.out.println("Nearest largest number to the entered number: " + max);

    }
}

