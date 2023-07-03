package _8kyu;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/57cc975ed542d3148f00015b
 */
public class YouOnlyNeedOneBeginner {
    public static boolean check(Object[] a, Object x) {
        return Stream.of(a).anyMatch(c -> c.equals(x));
    }

    public static boolean checkAlter(Object[] a, Object x) {
        for (Object obj : a) {
            if (x.equals(obj)) return true;
        }
        return false;
    }

    public static boolean checkAlterTwo(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
