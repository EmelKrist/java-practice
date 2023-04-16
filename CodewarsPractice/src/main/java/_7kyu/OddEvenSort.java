package _7kyu;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/580755730b5a77650500010c
 */
public class OddEvenSort {
    public static String sortMyString(String s) {
        StringBuilder evenInd = new StringBuilder();
        StringBuilder oddInd = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (i % 2 == 1) oddInd.append(s.charAt(i));
            else evenInd.append(s.charAt(i));
        }
        return evenInd.append(" ").append(oddInd.toString()).toString();
    }

    public static String sortMyStringAlter(String s) {
        String odd = IntStream.range(0, s.length())
                .filter(i -> i % 2 == 1).mapToObj(value -> String.valueOf(s.charAt(value)))
                .collect(Collectors.joining());
        String even = IntStream.range(0, s.length())
                .filter(i -> i % 2 == 0).mapToObj(value -> String.valueOf(s.charAt(value)))
                .collect(Collectors.joining());
        return even + " " + odd;
    }
}
