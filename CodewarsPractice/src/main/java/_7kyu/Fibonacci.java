package _7kyu;

/**
 * https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af/train/java
 */
public class Fibonacci {
    public static long fib(int n) {
        if (n <= 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
