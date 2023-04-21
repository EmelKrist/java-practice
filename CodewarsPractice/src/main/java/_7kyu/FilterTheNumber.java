package _7kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/55b051fac50a3292a9000025
 */
public class FilterTheNumber {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[a-z]", ""));
    }

    public static long filterStringAlter(final String value) {
        return Long.parseLong(Arrays.asList(value.split(""))
                .stream()
                .filter(i -> !i.matches("\\D"))
                .collect(Collectors.joining()));
    }
}
