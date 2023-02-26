package _6kyu;

import java.util.HashMap;
import java.util.Map;

/*
Write a function that will return the count of distinct case-insensitive alphabetic
characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets
(both uppercase and lowercase) and numeric digits.
https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
 */
public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("Indivisibilities"));
        System.out.println(duplicateCountAlter("Indivisibilities"));
        System.out.println(duplicateCountAlterTwo("Indivisibilities"));
    }

    public static int duplicateCountAlterTwo(String text) {
        int count = 0;
        text = text.toLowerCase();
        while (text.length() > 0) {
            String first = text.substring(0, 1);
            text = text.substring(1);
            if (text.contains(first)) count++;
            text = text.replaceAll(first, "");
        }
        return count;
    }

    public static int duplicateCountAlter(String text) {
        Map<Character, Boolean> map = new HashMap<>();
        for (char i : text.toLowerCase().toCharArray()) {
            map.put(i, map.containsKey(i) ? true : false);
        }
        return (int) map.values().stream().filter(c -> c == true).count();
    }

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (char i : text.toCharArray()) {
            if (map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> valMap : map.entrySet()) {
            if (valMap.getValue() > 1) count++;
        }
        return count;
    }


}
