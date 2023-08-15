package Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[] list = new int[5];
        int[] list2 = {1, 2, 3, 4, 5};

        int[][] distance = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };

        System.out.println(distance[5][5]);
        System.out.println(distance[4][5]);

        System.out.println("==========");

        // first one is row: 3, second one is column: 4
        int[][] matrix = new int[3][4];
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        /*
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

         */
    }
}


