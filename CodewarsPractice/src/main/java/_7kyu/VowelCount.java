package _7kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/54ff3102c1bad923760001f3
 */
public class VowelCount {
    public static int getCount(String str) {
        return (int) str.chars().mapToObj(Character::toString).filter("aeiou"::contains).count();
    }

    public static int getCountAlter(String str) {
        return str.replaceAll("[^aeiou]", "").length();
    }

    public static int getCountAlterTwo(String str) {
        var vowels = Arrays.asList('a','e','i','o','u');
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (vowels.contains(str.charAt(i))) count++;
        }
        return count;
    }
}
