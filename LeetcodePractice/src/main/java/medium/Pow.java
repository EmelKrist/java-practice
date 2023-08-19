package medium;

public class Pow {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;

        if (n == Integer.MAX_VALUE) {
            x *= x;
            n /= 2;
        }

        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        double result = 1.0;
        while (n > 0) {
            if (n % 2 == 1)
                result *= x;

            x *= x;
            n /= 2;
        }
        return result;
    }

}
