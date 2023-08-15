package Arrays;

public class OneDimensionalArrays {
    public static void main(String[] args) {
        String[] weekDays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] weekEnds = {"Saturday", "Sunday"};

        int[] numbers = new int[100];
        System.out.println(numbers.length);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        cars[2] = "Toyota";
        System.out.println(cars[0]);
    }
}
