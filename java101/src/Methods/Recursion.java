package Methods;

public class Recursion {

    static int f(int n) {
        System.out.println("n => " + n);
        if (n == 1) {
            return 1;
        }
        int result = f(n - 1) + n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("result => " + f(4));
    }
}
