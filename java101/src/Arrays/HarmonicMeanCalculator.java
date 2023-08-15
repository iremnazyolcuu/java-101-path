package Arrays;

import java.util.Scanner;

public class HarmonicMeanCalculator {
    public static void main(String[] args) {
        /*
        Calculate the average of elements in an array:

        int[] list = {1, 2, 3, 4, 5};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double average = sum / list.length;
        System.out.println(average);
        */

        // Calculate the harmonic mean of elements in an array:
        Scanner input = new Scanner(System.in);
        System.out.println("Size of the array:");
        int size = input.nextInt();

        double[] arr = new double[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum += 1.0 / arr[i];
        }

        double harmonicMean = size / sum;
        System.out.println("Harmonic mean of the array: " + harmonicMean);

    }
}
