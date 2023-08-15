package Arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        int[] list2 = {5, 67, 78, 2, 13, 1};
        int[] list3 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        int[] list4 = {1, 2, 3};
        int[] list5 = {1, 2, 3};
        int[] list6 = {1, 2, 10};

        // Arrays.toString(): is a method used to print the elements belonging to an array.
        System.out.println(Arrays.toString(list2));  // [5, 67, 78, 2, 13, 1]

        // Arrays.fill(): is a method that allows us to assign a specific value to all elements in an array.
        Arrays.fill(list, 10);
        System.out.println(Arrays.toString(list));  // [10, 10, 10, 10, 10, 10, 10]

        Arrays.fill(list, 2, 5, 10);
        System.out.println(Arrays.toString(list));  // [1, 2, 10, 10, 10, 6, 7]

        // Arrays.sort(): is a method that allows us to sort the elements in arrays.
        Arrays.sort(list3);
        System.out.println(Arrays.toString(list3));  // [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]

        // Arrays.binarySearch(): can be used to find the index of an element within an array.
        // However, the array must be sorted first!
        Arrays.sort(list3);
        System.out.println(Arrays.toString(list3)); // [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]

        int index = Arrays.binarySearch(list3, 21);
        System.out.println("Index of 21: " + index);  // 6

        // Arrays.copyOf(): method is used to create a new array of a specific length from the existing array.
        int[] copyArray = Arrays.copyOf(list2, 3);
        System.out.println(Arrays.toString(copyArray));  // [5, 67, 78]

        // Arrays.copyOfRange(): method is used to create a new array from a specific range of the existing array.
        int[] copyOfRangeArray = Arrays.copyOfRange(list2, 0, 5);
        System.out.println(Arrays.toString(copyOfRangeArray));  // [5, 67, 78, 2, 13]

        // Arrays.equals(): method is used to check the equality of two arrays.
        System.out.println(Arrays.equals(list4, list5));  // true
        System.out.println(Arrays.equals(list5, list6));  // false
    }
}
