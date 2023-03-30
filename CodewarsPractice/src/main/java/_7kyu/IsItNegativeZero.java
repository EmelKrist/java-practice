package _7kyu;

/**
 * https://www.codewars.com/kata/5c5086287bc6600001c7589a
 */
public class IsItNegativeZero {
    public static boolean isNegativeZero(float n) {
        return String.valueOf(n).equals("-0.0");
    }

    public static boolean isNegativeZeroAlter(float n) {
        return new Float(n).equals(-0.0f);
    }
}
