package _7kyu;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/5b39e3772ae7545f650000fc
 */
public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String s) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(s.split(" ")));
        return set.toString().replaceAll("[,\\[\\]]", "");
    }

    public static String removeDuplicateWordsAlter(String s) {
        return Arrays.stream(s.split("\\s+")).distinct().collect(Collectors.joining(" "));
    }

    public static String removeDuplicateWordsAlterTwo(String s) {
        return String.join(" ", new LinkedHashSet<>(Arrays.asList(s.split("\\s+"))));
    }

    public static String removeDuplicateWordsAlterThree(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word: s.split("\\s+")){
            if (!stringBuilder.toString().contains(word)) stringBuilder.append(word).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
