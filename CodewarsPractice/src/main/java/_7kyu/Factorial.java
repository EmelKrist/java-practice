package _7kyu;

/**
 * https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc
 */
public class Factorial {
    public int factorial(int n) {
        if (n < 0 || n > 12) throw new IllegalArgumentException();
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public int factorialAlter(int n) {
        if (n < 0 || n > 12) throw new IllegalArgumentException();
        int factorial = 1;
        for (int i = 2; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
}
