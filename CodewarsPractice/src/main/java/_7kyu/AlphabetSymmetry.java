package _7kyu;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/59d9ff9f7905dfeed50000b0/train/java
 */
public class AlphabetSymmetry {
    public static int[] solve(String[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            String word = arr[i].toLowerCase();
            for (int j = 0; j < arr[i].length(); j++) {
                int alphabetPosition = word.charAt(j) - 'a';
                if (alphabetPosition == j) count++;
            }
            result[i] = count;
        }
        return result;
    }

    public static int[] solveAlter(String[] arr) {
        return Stream.of(arr).map(String::toLowerCase).mapToInt(i -> countLetters(i)).toArray();
    }

    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    private static int countLetters(String word) {
        return (int) IntStream.range(0, word.length()).filter(i -> alphabet.indexOf(word.charAt(i)) == i).count();
    }

}
