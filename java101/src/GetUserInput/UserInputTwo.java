package GetUserInput;

import java.util.Scanner;

public class UserInputTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name : ");
        String fullName = input.nextLine();

        System.out.println("Enter your age : ");
        int age = input.nextInt();

        System.out.println("Enter your salary : ");
        double salary = input.nextDouble();


        System.out.println("Full name: " + fullName);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);

    }

}
