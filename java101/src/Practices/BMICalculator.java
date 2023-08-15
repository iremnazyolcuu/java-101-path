package Practices;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        int kg;
        double height, bmi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        height = inp.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        kg = inp.nextInt();

        bmi = kg / (height * height);
        System.out.print("Your BMI is: " + bmi);

    }
}
