package Practices;

import java.util.Scanner;

public class FlightTicketCalculator {

    public static void main(String[] args) {

        int age, tripType;
        double distance, regularPrice, costPerKm = 0.1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the total distance in km: ");
        distance = inp.nextDouble();

        System.out.println("Enter your age: ");
        age = inp.nextInt();

        System.out.print("Enter the trip type (1 => One-way, 2 => Round-trip): ");
        tripType = inp.nextInt();

        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Invalid Data Entry!");
        }

        regularPrice = distance * costPerKm;

        if (age < 12) {
            regularPrice *= 0.5;
        } else if (age >= 12 && age <= 24) {
            regularPrice *= 0.9;
        } else if (age > 65) {
            regularPrice *= 0.7;
        }

        if (tripType == 2) {
            regularPrice *= 0.8;
            regularPrice *= 2;
        }

        System.out.println("Total Price is: " + regularPrice + " TL");

    }
}
