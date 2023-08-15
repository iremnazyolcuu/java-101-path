package Arrays;

public class MatrixTransposeFinder {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 8},
                {2, 7, 4},
                {6, 8, 5},
                {9, 2, 3}
        };

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(" " + column + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose:");
        int columns = matrix[0].length;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
