package Practices;

import java.util.Scanner;

public class PerfectNumberChecker {

    public static void main(String[] args) {

        int num, sum = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = inp.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

    }
}
