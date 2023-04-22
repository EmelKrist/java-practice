package _7kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5949481f86420f59480000e7
 */
public class OddOrEven {
    public static String oddOrEven (int[] array) {
        return array.length == 0 || Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }

    public static String oddOrEvenAlter (int[] array) {
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return sum % 2 == 0 ? "even" : "odd";
    }
}
