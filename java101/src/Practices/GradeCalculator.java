package Practices;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        // create the variables :
        int math, physic, chemistry, turkish, history, music;

        // create the Scanner class :
        Scanner inp = new Scanner(System.in);

        // get input from the user :
        System.out.println("Math Grade: ");
        math = inp.nextInt();

        System.out.println("Physics Grade: ");
        physic = inp.nextInt();

        System.out.println("Chemistry Grade: ");
        chemistry = inp.nextInt();

        System.out.println("Turkish Grade: ");
        turkish = inp.nextInt();

        System.out.println("History Grade: ");
        history = inp.nextInt();

        System.out.println("Music Grade: ");
        music = inp.nextInt();


        int sum = (math + physic + chemistry + turkish + history + music);
        double totalGrade = sum / 6;

        System.out.println("Your Total Grade is: " + totalGrade);
        System.out.println(totalGrade >= 60 ? "Congrats, you passed the class!" : "Sorry, you failed the class!");

    }
}



