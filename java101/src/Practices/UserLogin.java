package Practices;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        String username, password, answer, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter your username: ");
        username = inp.nextLine();

        System.out.println("Enter your password: ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Login successful!");
        } else if (username.equals("patika") && !(password.equals("java123"))) {
            System.out.println("Do you want to reset your password? (Yes/No): ");
            answer = inp.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter a new password: ");
                newPassword = inp.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Password creation failed! The new password cannot be the same as the forgotten password!");
                } else {
                    System.out.println("New password created successfully!");
                }
            } else {
                System.out.println("Password reset not requested.");
            }
        } else {
            System.out.println("Incorrect login credentials!");
        }
    }
}
