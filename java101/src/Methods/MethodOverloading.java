package Methods;

public class MethodOverloading {

    static void print() {
        System.out.println("Method without a parameter.");
    }

    static void print(int a) {
        System.out.println("Method with a parameter: " + a);
    }

    static int print(int a, int b) {
        return a + b;
    }

    static int print(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        print();
        print(12);
        System.out.println(print(1, 3));
        System.out.println(print(2, 4, 6));
    }
}
