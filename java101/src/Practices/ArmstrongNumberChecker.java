package Practices;

import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int numberOfDigits = 0;
        int tempNumber = number;
        int digitValue;
        int armstrongSum = 0;
        int digitPower;

        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            digitPower = 1;
            for (int i = 1; i <= numberOfDigits; i++) {
                digitPower *= digitValue;
            }
            armstrongSum += digitPower;
            tempNumber /= 10;
        }

        if (armstrongSum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
