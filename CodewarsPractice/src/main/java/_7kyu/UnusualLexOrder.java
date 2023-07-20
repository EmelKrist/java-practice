package _7kyu;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.codewars.com/kata/5a438bc1e1ce0e129100005a
 */
public class UnusualLexOrder {
    static String[] unusualLexOrder(String[] words) {
        return Arrays.stream(words)
                .sorted(Comparator.comparing(i -> new StringBuilder(i).reverse().toString()))
                .toArray(String[]::new);
    }
}
