package Practices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int n1, n2, selected;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("You selected: ");
        selected = input.nextInt();

        switch (selected) {
            case 1:
                System.out.println("Addition: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtraction: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplication: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Division: " + (n1 / n2));
                } else {
                    System.out.println("A number cannot be divided by 0!");
                }
                break;
            default:
                System.out.println("You made a wrong selection! Please try again!");
        }
    }
}
