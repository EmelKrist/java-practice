package _8kyu;

import java.util.Arrays;
import java.util.Objects;

/**
 * https://www.codewars.com/kata/56676e8fabd2d1ff3000000c
 */
public class NeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (Objects.equals(haystack[i], "needle")) {
                return "found the needle at position " + i;
            }
        }
        return "";
    }

    public static String findNeedleAlter(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}
