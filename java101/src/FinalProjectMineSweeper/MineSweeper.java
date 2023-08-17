package FinalProjectMineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    Random randomMineNumber = new Random();
    int row;
    int column;
    String[][] mineField;
    String[][] displayField;
    int totalMines;

    public void run() {
        System.out.println(" = Welcome to the Minesweeper Game = ");
        System.out.print("Enter the Number of Rows    : ");
        row = input.nextInt();
        System.out.print("Enter the Number of Columns : ");
        column = input.nextInt();

        totalMines = (row * column) / 4;

        mineField = new String[row][column];
        displayField = new String[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                displayField[i][j] = "-";
                mineField[i][j] = "-";
            }
        }

        while (totalMines > 0) {
            int rowMineNumber = randomMineNumber.nextInt(row);
            int columnMineNumber = randomMineNumber.nextInt(column);

            if (mineField[rowMineNumber][columnMineNumber].equals("-")) {
                mineField[rowMineNumber][columnMineNumber] = "*";
                totalMines--;
            }
        }
        printDisplayField();

        playGame();
    }

    public void playGame() {
        boolean finish = false;
        while (!finish) {
            System.out.print("Enter the Row Number    : ");
            int selectedRow = input.nextInt();
            System.out.print("Enter the Column Number : ");
            int selectedColumn = input.nextInt();

            int mineNumber = 0;

            if (selectedRow < row && selectedColumn < column) {
                if (mineField[selectedRow][selectedColumn].equals("-") && displayField[selectedRow][selectedColumn].equals("-")) {
                    for (int i = selectedRow - 1; i < selectedRow + 2; i++) {
                        for (int j = selectedColumn - 1; j < selectedColumn + 2; j++) {
                            if (i >= 0 && j >= 0 && i < row && j < column && mineField[i][j].equals("*")) {
                                mineNumber++;
                                displayField[selectedRow][selectedColumn] = Integer.toString(mineNumber);
                            } else {
                                displayField[selectedRow][selectedColumn] = Integer.toString(mineNumber);
                            }
                        }
                    }
                    printDisplayField();
                    if (!checkWin()) {
                        System.out.println("Congratulations, you have won the game! :)");
                        printMineField();
                        finish = true;
                    }

                } else if (mineField[selectedRow][selectedColumn].equals("*")) {
                    System.out.println("You hit a mine! Boom!!! ");
                    printMineField();
                    finish = true;
                } else if (!displayField[selectedRow][selectedColumn].equals("-")) {
                    System.out.println("Already entered! Please choose a different cell!");
                }

            } else {
                System.out.println("Incorrect input! Please choose a cell within the playing field!");
            }
        }
    }

    public void printMineField() {
        for (String[] row : mineField) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
    }

    public void printDisplayField() {
        for (String[] row : displayField) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
    }

    boolean checkWin() {
        int emptyCell = 0;
        int minedCell = 0;
        for (int i = 0; i < displayField.length; i++) {
            for (int j = 0; j < displayField[i].length; j++) {
                if (displayField[i][j].equals("-")) {
                    emptyCell++;
                }
                if (mineField[i][j].equals("*")) {
                    minedCell++;
                }
            }
        }
        if (emptyCell == minedCell) {
            return false;
        }
        return true;
    }
}

