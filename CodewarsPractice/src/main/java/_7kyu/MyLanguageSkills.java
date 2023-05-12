package _7kyu;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/5b16490986b6d336c900007d
 */
public class MyLanguageSkills {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        Map<String, Integer> languages = results.entrySet().stream()
                .filter(i -> i.getValue() >= 60)
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        return new LinkedList<>(languages.keySet());
    }
}
