package _8kyu;

/**
 * https://www.codewars.com/kata/55685cd7ad70877c23000102
 */
public class ReturnNegative {
    public static int makeNegative(final int x) {
        return x <= 0 ? x : -x;
    }

    public static int makeNegativeAlter(final int x) {
        return -Math.abs(x);
    }
}
