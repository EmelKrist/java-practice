package _7kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/55afed09237df73343000042
 */
public class LuckyNumber {

    public static boolean isLuckyAlter(long n) {
        // https://en.wikipedia.org/wiki/Divisibility_rule
        return n % 9 == 0;
    }

    public static boolean isLuckyAlterTwo(long n) {
        int sum = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::valueOf).sum();
        return sum % 9 == 0;
    }

    public static boolean isLucky(long n) {
        double sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum == 0.0 || (sum / 9.0) % 1 == 0.0;
    }
}
