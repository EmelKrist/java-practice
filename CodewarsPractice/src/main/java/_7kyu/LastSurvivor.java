package _7kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/609eee71109f860006c377d1
 */
public class LastSurvivor {
    public static String lastSurvivor(String letters, int[] coords) {
        StringBuilder result = new StringBuilder(letters);
        for (int i : coords) result.deleteCharAt(i);
        return result.toString();
    }

    public static String lastSurvivorAlter(String letters, int[] coords) {
        StringBuilder result = new StringBuilder(letters);
        Arrays.stream(coords).forEach(result::deleteCharAt);
        return result.toString();
    }
}
