package Practices;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        // Factorial:
        // n! = 1 * 2 * 3 * 4 * ... * n

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int total = 1;

        for (int i = 1; i <= num; i++) {
            total = total * i;
        }

        System.out.println("Factorial of " + num + ": " + total);

    }
}
