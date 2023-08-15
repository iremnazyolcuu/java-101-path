package Practices;

import java.util.Scanner;

public class EvenNumberFinder {

    public static void main(String[] args) {

        int num, sum = 0, count = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        System.out.print("Even numbers from 1 to " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            average = (double) sum / count;
            System.out.println("\nAverage of numbers divisible by 3 and 4 from 0 to " + num + " is: " + average);
        } else {
            System.out.println("There are no numbers in the range from 0 to " + num + " that are divisible by both 3 and 4!");
        }

    }
}
