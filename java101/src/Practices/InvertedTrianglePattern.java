package Practices;

import java.util.Scanner;

public class InvertedTrianglePattern {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of steps: ");
        int steps = inp.nextInt();

        for (int i = steps; i >= 1; i--) {
            for (int j = 1; j <= steps - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
