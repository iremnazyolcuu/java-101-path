package Practices;

import java.util.Scanner;

public class FindMinMaxNumbers {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int num = inp.nextInt();

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= num; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = inp.nextInt();

            if (number > maxNumber) {
                maxNumber = number;
            }

            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}
