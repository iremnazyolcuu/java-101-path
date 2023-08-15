package Practices;

import java.util.Scanner;

public class SumOfDigitsCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digit;
        int sumOfDigits = 0;

        while (number != 0) {
            digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        System.out.print("Total: " + sumOfDigits);
    }
}
