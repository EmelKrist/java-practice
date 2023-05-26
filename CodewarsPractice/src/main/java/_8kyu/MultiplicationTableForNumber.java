package _8kyu;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce
 */
public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        StringBuilder mTable = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            mTable.append(i).append(" * ").append(num).append(" = ").append(i * num).append(System.getProperty("line.separator"));
        }
        return mTable.toString().trim();
    }

    public static String multiTableAlter(int num) {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> i + " * " + num + " = " + i * num)
                .collect(Collectors.joining(System.getProperty("line.separator")));
    }
}
