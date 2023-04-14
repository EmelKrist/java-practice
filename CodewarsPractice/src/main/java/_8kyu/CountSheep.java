package _8kyu;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5b077ebdaf15be5c7f000077
 */
public class CountSheep {
    public static String countingSheep(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= num; i++){
            str.append(i + 1).append(" sheep...");
        }
        return str.toString();
    }

    public static String countingSheepAlter(int num) {
        return IntStream.rangeClosed(1, num).mapToObj(i -> i + " sheep...").collect(Collectors.joining());
    }

}
