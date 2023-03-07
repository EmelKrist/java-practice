package _8kyu;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
 */
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static String repeatStrAlter(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    public static String repeatStrAlterTwo(final int repeat, final String string) {
       return IntStream.range(0, repeat).mapToObj(i-> string).collect(Collectors.joining()).toString();
    }
}
