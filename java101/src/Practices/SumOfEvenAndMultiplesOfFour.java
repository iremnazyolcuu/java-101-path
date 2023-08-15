package Practices;

import java.util.Scanner;

public class SumOfEvenAndMultiplesOfFour {

    public static void main(String[] args) {

        int num;
        int total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            num = scan.nextInt();
            if (num % 2 == 0 && num % 4 == 0) {
                total += num;
            }
        } while (num % 2 == 0);

        System.out.println("Total : " + total);
    }
}
