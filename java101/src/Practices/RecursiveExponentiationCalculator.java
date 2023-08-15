package Practices;

import java.util.Scanner;

public class RecursiveExponentiationCalculator {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        int base = inp.nextInt();

        System.out.print("Enter the exponent value: ");
        int exponent = inp.nextInt();

        int result = power(base, exponent);
        System.out.println("Result: " + result);
    }

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
