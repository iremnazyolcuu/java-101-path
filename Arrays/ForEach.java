package Arrays;

public class ForEach {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4};

        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("==========");

        String[] cars = {"BMW", "Mercedes", "Ford", "Ferrari"};
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println("==========");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
