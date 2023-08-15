package Practices;

import java.util.Scanner;

public class AdvancedCalculator {
    static Scanner scan = new Scanner(System.in);

    static void addition() {
        int number, result = 0, i = 1;

        while (true) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();

            if (number == 0) {
                break;
            }

            result += number;
            i++;
        }

        System.out.println("Result: " + result);
    }

    static void subtraction() {
        System.out.print("How many numbers will you enter?: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();

            if (i == 1) {
                result += number;
            } else {
                result -= number;
            }
        }

        System.out.println("Result: " + result);
    }

    static void multiplication() {
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();

            if (number == 1) {
                break;
            }

            result *= number;
            i++;
        }

        System.out.println("Result: " + result);
    }

    static void division() {
        System.out.print("How many numbers will you enter?: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextDouble();

            if (i != 1 && number == 0) {
                System.out.println("You cannot divide by 0!");
            } else {
                if (i == 1) {
                    result = number;
                } else {
                    result /= number;
                }
            }
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        System.out.print("Enter the base value: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent value: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial() {
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("You can't enter a number less than or equal to zero!");
        } else {
            int result = a % b;
            System.out.println("Result: " + result);
        }
    }

    static void rect() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = scan.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scan.nextInt();

        if (length <= 0 || width <= 0) {
            System.out.println("The sides of the rectangle cannot be zero or negative!");
        } else {
            int perimeter = 2 * (length + width);
            int area = length * width;
            System.out.println("Rectangle Perimeter: " + perimeter);
            System.out.println("Rectangle Area: " + area);
        }
    }

    public static void main(String[] args) {
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponentiation\n"
                + "6- Factorial\n"
                + "7- Modulus\n"
                + "8- Rectangle Area and Perimeter Calculation\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please select an operation: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rect();
                    break;
                case 0:
                    System.out.println("You have successfully exited!");
                    break;
                default:
                    System.out.println("Invalid input, please try again!");
            }
        } while (select != 0);
    }
}
