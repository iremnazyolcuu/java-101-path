package Practices;

import java.util.Scanner;

public class CombinationCalculator {

    public static void main(String[] args) {

        // Combination:
        // C(n,r) = n! / (r! * (n-r)!)

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of 'n': ");
        int n = input.nextInt();

        System.out.print("Enter the value of 'r': ");
        int r = input.nextInt();

        int nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        int rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        int nrFactorial = 1;
        for (int i = 1; i <= n - r; i++) {
            nrFactorial *= i;
        }

        double total = nFactorial / (rFactorial * (nrFactorial));

        System.out.println("C(" + n + "," + r + ") = " + total);

    }
}
