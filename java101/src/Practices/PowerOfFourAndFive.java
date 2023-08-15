package Practices;

import java.util.Scanner;

public class PowerOfFourAndFive {

    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        System.out.println("Powers of 4 up to the " + num + ":");
        for (int i = 1; i <= num; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5 up to the " + num + ":");
        for (int j = 1; j <= num; j *= 5) {
            System.out.println(j);
        }
    }
}
