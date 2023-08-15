package Practices;

public class PalindromeNumberChecker {

    static boolean isPalindrom(int number) {
        int temp = number, reversedNumber = 0, lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp /= 10;
        }

        if (number == reversedNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(2476));
        System.out.println(isPalindrom(9889));
    }
}
