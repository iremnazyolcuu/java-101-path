package Practices;

import java.util.Scanner;

public class GcdLcmCalculator {

    public static void main(String[] args) {

        int k = 1, i = 1, num1, num2, gcd = 1, lcm = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        while (i <= num1) {
            i++;
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        lcm = (num1 * num2) / gcd;

        System.out.println("GCD (Greatest Common Divisor): " + gcd);
        System.out.print("LCM (Least Common Multiple): " + lcm);

    }
}
