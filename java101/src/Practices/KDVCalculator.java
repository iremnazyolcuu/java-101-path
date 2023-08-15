package Practices;

import java.util.Scanner;

public class KDVCalculator {

    public static void main(String[] args) {

        double price, kdvRatio = 0.18, kdv, priceWithKdv;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price: ");
        price = input.nextDouble();

        kdv = (price > 1000) ? 0.8 : 0.18;
        kdv = price * kdvRatio;
        priceWithKdv = price + kdv;

        System.out.println("Price without KDV: " + price);
        System.out.println("KDV ratio: " + kdvRatio);
        System.out.println("KDV: " + kdv);
        System.out.println("Price with KDV: " + priceWithKdv);
    }
}
