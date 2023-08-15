package Practices;

import java.util.Scanner;

public class ExponentiationCalculator {

    public static void main(String[] args) {

        int base, exponent;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        base = input.nextInt();

        System.out.print("Enter the exponent: ");
        exponent = input.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.print("Result: " + result);
    }
}
