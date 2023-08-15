package Practices;

import java.util.Scanner;

public class GroceryStoreCalculator {

    public static void main(String[] args) {

        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00, total;

        Scanner input = new Scanner(System.in);

        System.out.println("How many kilograms of pears do you have?: ");
        double pearKg = input.nextDouble();

        System.out.println("How many kilograms of apples do you have?: ");
        double appleKg = input.nextDouble();

        System.out.println("How many kilograms of tomatoes do you have?: ");
        double tomatoKg = input.nextDouble();

        System.out.println("How many kilograms of bananas do you have?: ");
        double bananaKg = input.nextDouble();

        System.out.println("How many kilograms of eggplants do you have?: ");
        double eggplantKg = input.nextDouble();

        total = (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (eggplant * eggplantKg);
        System.out.println("Total price to be paid is: " + total + " TL");

    }
}
