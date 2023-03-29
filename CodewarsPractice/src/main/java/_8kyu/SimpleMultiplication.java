package _8kyu;

/**
 * https://www.codewars.com/kata/583710ccaa6717322c000105
 */
public class SimpleMultiplication {
    public static int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }

    public static int simpleMultiplicationAlter(int n) {
        return n * (n % 2 + 8);
    }
}
