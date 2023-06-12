package _6kyu;

import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/59c633e7dcc4053512000073
 */
public class ConsonantValue {
    public static int solve(final String s) {
        String vowels = "aeoui";
        StringBuilder sub = new StringBuilder();
        int maxValue = 0;
        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            if (!vowels.contains(letter)) sub.append(letter);
            else {
                int value = 0;
                for (int j = 0; j < sub.length(); j++) {
                    value += sub.charAt(j) - 96;
                }
                if (maxValue < value) maxValue = value;
                sub.setLength(0);
            }
        }
        return maxValue;
    }

    public static int solveAlter(final String s) {
        return Stream.of(s.split("[aeiou]")).mapToInt(cons -> cons.chars().map(c -> c - 96).sum()).max().orElse(0);
    }
}
