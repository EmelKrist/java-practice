package easy;

public class Factorial {
    public long factorial(int n) {
        if (n < 2) return 1;
        return n * factorial(n - 1);
    }

    public long factorialAlter(int n) {
        if (n < 2) return 1;
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public long factorialSecondAlter(int n) {
        if (n == 0) return 1;
        int[] factorials = new int[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i;
        }
        return factorials[n];
    }
}
