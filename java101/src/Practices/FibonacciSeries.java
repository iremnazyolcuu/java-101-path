package Practices;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int n = inp.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print("Fibonacci Series with " + n + " elements: " + firstNumber + " " + secondNumber);

        for (int i = 2; i < n; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(" " + nextNumber);

            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
