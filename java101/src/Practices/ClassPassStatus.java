package Practices;

import java.util.Scanner;

public class ClassPassStatus {

    public static void main(String[] args) {

        int i = 0, math, physic, chemistry, turkish, music, total = 0;
        double average;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Math Grade: ");
        math = inp.nextInt();
        if ((math >= 0) && (math <= 100)) {
            total += math;
            i += 1;
        }

        System.out.println("Enter the Physics Grade: ");
        physic = inp.nextInt();
        if ((physic >= 0) && (physic <= 100)) {
            total += physic;
            i += 1;
        }

        System.out.println("Enter the Chemistry Grade: ");
        chemistry = inp.nextInt();
        if ((chemistry >= 0) && (chemistry <= 100)) {
            total += chemistry;
            i += 1;
        }

        System.out.println("Enter the Turkish Grade: ");
        turkish = inp.nextInt();
        if ((turkish >= 0) && (turkish <= 100)) {
            total += turkish;
            i += 1;
        }

        System.out.println("Enter the Music Grade: ");
        music = inp.nextInt();
        if ((music >= 0) && (music <= 100)) {
            total += music;
            i += 1;
        }

        average = (double) total / i;
        System.out.println("Your Average Grade: " + average);

        if (average >= 55) {
            System.out.println("Congratulations, you passed the class!");
        } else {
            System.out.println("You failed the class!");
        }
    }
}
