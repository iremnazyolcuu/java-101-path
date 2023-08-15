package Practices;

import java.util.Scanner;

public class RecursivePrimeNumbers {
    static boolean isPrime(int number, int divisor) {

        if (number == 0 || number == 1) {
            return false;
        }

        if (number == 2) {
            return true;
        } else {
            // If the number has a divisor, it must be equal to 1 and itself. Otherwise, the number is not prime.
            if (number % divisor == 0) {
                if (divisor == 1) {
                    return isPrime(number, divisor + 1);
                } else if (number == divisor) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return isPrime(number, divisor + 1);
            }
        }
    }

    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number!");
        }
    }
}
