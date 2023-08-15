package Arrays;

public class Arrays {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = result.length - 1; i < arr.length; i++, j--) {
            result[j] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = (i * 10) + 10;
            System.out.println(list[i]);
        }

        int[] list2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int[] newList = reverse(list2);
        System.out.println("==========");
        printArray(newList);
    }
}
