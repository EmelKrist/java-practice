package _5kyu;

import java.math.BigInteger;

/**
 * https://www.codewars.com/kata/559a28007caad2ac4e000083
 */
public class PerimeterOfSquaresInARectangle {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger fib = BigInteger.ZERO;
        BigInteger last = BigInteger.ONE;
        BigInteger preLast = BigInteger.ZERO;
        BigInteger sum = BigInteger.ZERO;
        for (long i = 1; i <= n.longValue() + 1; i++) {
            preLast = last;
            last = fib;
            fib = preLast.add(last);
            sum = sum.add(fib);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }
}
