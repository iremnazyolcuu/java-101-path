package Practices;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        String username, password;

        Scanner input = new Scanner(System.in);
        int attemptsLeft = 3;
        int balance = 2000;
        int choice;
        int amount;

        while (attemptsLeft > 0) {
            System.out.print("Enter your username: ");
            username = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome!");

                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw money\n" +
                            "3-Balance inquiry\n" +
                            "4-Log out");
                    System.out.println("Please select the action you want to take: ");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter the amount to deposit: ");
                            amount = input.nextInt();
                            balance += amount;
                            break;
                        case 2:
                            System.out.print("Enter the amount to withdraw: ");
                            amount = input.nextInt();
                            if (amount > balance) {
                                System.out.print("You have insufficient balance!");
                            } else {
                                balance -= amount;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + balance + "\n");
                            break;
                    }
                } while (choice != 4);

                System.out.println("Logged out successfully! See you again!");
                break;
            } else {
                attemptsLeft--;
                System.out.println("Wrong username or password! Please try again!");

                if (attemptsLeft == 0) {
                    System.out.println("Your account has been blocked! Please contact the bank!");
                } else {
                    System.out.println("Remaining attempts left: " + attemptsLeft);
                }
            }
        }
    }
}
