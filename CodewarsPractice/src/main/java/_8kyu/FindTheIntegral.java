package _8kyu;

/**
 * https://www.codewars.com/kata/59811fd8a070625d4c000013
 */
public class FindTheIntegral {
    public static String integrate(int coefficient, int exponent) {
        return coefficient / --exponent + "x^" + exponent;
    }

    public static String integrateAlter(int coefficient, int exponent) {
        int newExponent = exponent++;
        return String.format("%sx^%s", coefficient / newExponent, newExponent);
    }
}
