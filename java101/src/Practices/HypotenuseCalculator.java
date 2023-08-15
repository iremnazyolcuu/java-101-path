package Practices;

import java.util.Scanner;

public class HypotenuseCalculator {

    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of first side: ");
        a = input.nextInt();

        System.out.println("Enter the length of second side: ");
        b = input.nextInt();

        c = (int) Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse: " + c);

        double perimeter = (a + b + c);
        double u = perimeter / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Perimeter of the triangle : " + perimeter);
        System.out.println("Area of the triangle : " + area);

    }
}
