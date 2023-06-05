package _8kyu;

import java.util.Collections;
import java.util.List;

/**
 * https://www.codewars.com/kata/5a07e5b7ffe75fd049000051
 */
public class SortMyTextbooks {
    public static List<String> sort(List<String> textbooks) {
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }

    public static List<String> sortAlter(List<String> textbooks) {
        return textbooks.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
    }
}
