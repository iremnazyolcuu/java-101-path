package Practices;

import java.util.Scanner;

public class HarmonicNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        double harmonicSum = 0.0;

        for (double i = 1; i <= n; i++) {
            harmonicSum += (1 / i);
        }

        System.out.println("The harmonic series sum for N = " + n + " is: " + harmonicSum);
    }
}
