package Practices;

import java.util.Scanner;

public class CircleGeometryCalculator {

    public static void main(String[] args) {

        int r;
        double centralAngle, pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        r = inp.nextInt();

        System.out.print("Enter the central angle of the circle: ");
        centralAngle = inp.nextDouble();

        double area = pi * r * r;
        double circumference = 2 * pi * r;
        double sectorArea = ((area * centralAngle) / 360);

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Sector area of the circle: " + sectorArea);

    }
}
