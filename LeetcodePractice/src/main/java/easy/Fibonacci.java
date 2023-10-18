package easy;

public class Fibonacci {
    public long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public long fibonacciAlter(int n) {
        if (n <= 1) return n;
        int[] fibonacciNumbers = new int[n + 1];
        fibonacciNumbers[0] = 0; fibonacciNumbers[1] = 1;

        for (int i = 2; i <= n; i++) {
            int last = fibonacciNumbers[i - 1];
            int preLast = fibonacciNumbers[i - 2];
            fibonacciNumbers[i] = last + preLast;
        }

        return fibonacciNumbers[n];
    }

    public long fibonacciSecondAlter(int n) {
        if (n <= 1) return n;
        int preLast = 0, last = 1, fibonacci = 0;
        for (int i = 2; i <= n; i++) {
            fibonacci = preLast + last;
            preLast = last;
            last = fibonacci;
        }
        return fibonacci;
    }
}
