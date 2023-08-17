package Practices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int targetNumber = rand.nextInt(100);

        Scanner inp = new Scanner(System.in);
        int correctAttempts = 0;
        int userGuess;
        int[] incorrectGuesses = new int[5];
        boolean hasWon = false;
        boolean hasMadeIncorrectGuess = false;

        System.out.println("Target number: " + targetNumber);
        while (correctAttempts < 5) {
            System.out.print("Please enter your guess: ");
            userGuess = inp.nextInt();

            if (userGuess < 0 || userGuess > 99) {
                System.out.println("Please enter a value between 0 and 100!");
                if (hasMadeIncorrectGuess) {
                    correctAttempts++;
                    System.out.println("You've made too many incorrect guesses! Remaining attempts: " + (5 - correctAttempts));
                } else {
                    hasMadeIncorrectGuess = true;
                    System.out.println("Your next incorrect guess will result in a deduction of attempts!");
                }
                continue;
            }

            if (userGuess == targetNumber) {
                System.out.println("Congratulations, correct guess! The guessed number is: " + targetNumber);
                hasWon = true;
                break;
            } else {
                System.out.println("Incorrect number!");
                if (userGuess > targetNumber) {
                    System.out.println(userGuess + " is greater than the target number.");
                } else {
                    System.out.println(userGuess + " is less than the target number.");
                }

                incorrectGuesses[correctAttempts++] = userGuess;
                System.out.println("Remaining attempts: " + (5 - correctAttempts));
            }
        }

        if (!hasWon) {
            System.out.println("You lost!");
            if (!hasMadeIncorrectGuess) {
                System.out.println("Your incorrect guesses: " + Arrays.toString(incorrectGuesses));
            }
        }
    }
}
