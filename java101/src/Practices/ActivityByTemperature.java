package Practices;

import java.util.Scanner;

public class ActivityByTemperature {

    public static void main(String[] args) {

        int temperature;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("Skiing is recommended.");
        } else if (temperature >= 5 && temperature <= 15) {
            System.out.println("Going to the cinema is recommended.");
        } else if (temperature >= 15 && temperature <= 25) {
            System.out.println("Going on a picnic is recommended.");
        } else {
            System.out.println("Swimming is recommended.");
        }
    }
}
