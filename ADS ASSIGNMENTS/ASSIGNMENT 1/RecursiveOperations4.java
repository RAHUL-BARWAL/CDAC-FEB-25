public class RecursiveOperations4 {
    public static boolean isPrime(int num, int divisor) {
        if (num < 2) return false;
        if (divisor == 1) return true;
        if (num % divisor == 0) return false;
        return isPrime(num, divisor - 1);
    }

    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isPalindrome(str, left + 1, right - 1);
    }

    public static int sumOfDigits(int num) {
        if (num == 0) return 0;
        return (num % 10) + sumOfDigits(num / 10);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int num = 7;
        String str = "racecar";
        int numDigits = 1234;
        int fibIndex = 6;
        int a = 2, b = 5;

        System.out.println("Is prime: " + isPrime(num, num / 2));
        System.out.println("Is '" + str + "' a palindrome? " + isPalindrome(str, 0, str.length() - 1));
        System.out.println("Sum of digits of " + numDigits + ": " + sumOfDigits(numDigits));
        System.out.println("Fibonacci(" + fibIndex + "): " + fibonacci(fibIndex));
        System.out.println(a + "^" + b + " = " + power(a, b));
    }
}
