package Practices;

import java.util.Scanner;

public class RecursivePattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        recursiveMethod(n);
    }

    public static void recursiveMethod(int num) {

        if (num <= 0) {
            System.out.println("Final Value: " + num);
            return;
        }

        System.out.println("Subtraction: " + num);
        num -= 5;

        recursiveMethod(num);

        System.out.println("Addition: " + num);
        num += 5;
    }
}


