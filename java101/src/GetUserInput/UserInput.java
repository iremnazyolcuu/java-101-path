package GetUserInput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Enter a value for number A : ");
        a = input.nextInt();

        System.out.println("Enter a value for number B : ");
        b = input.nextInt();

        System.out.println("number A : " + a);
        System.out.println("number B : " + b);

    }

}