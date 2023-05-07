package _7kyu;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/529eef7a9194e0cbc1000255
 */
public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) return false;
        StringBuilder stringBuilder = new StringBuilder(original.toLowerCase());
        for (String i : test.toLowerCase().split("")) {
            int idx = stringBuilder.indexOf(i);
            if (idx != -1) stringBuilder.deleteCharAt(idx);
        }
        return stringBuilder.isEmpty();
    }

    public static boolean isAnagramAlter(String test, String original) {
        if (test == null || original == null || test.length() != original.length()) return false;
        char[] testArr = test.toLowerCase().toCharArray();
        char[] originalArr = original.toLowerCase().toCharArray();
        Arrays.sort(testArr);
        Arrays.sort(originalArr);
        return Arrays.equals(testArr, originalArr);
    }

    public static boolean isAnagramAlterTwo(String test, String original) {
        return Stream.of(test.toLowerCase().split("")).sorted().collect(Collectors.joining())
               .equals(Stream.of(original.toLowerCase().split("")).sorted().collect(Collectors.joining()));
    }


}
