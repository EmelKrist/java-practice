package _7kyu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]*", "");
    }

    public static String disemvowelAlter(String str) {
        Set<Character> setOfVowels = new HashSet<>();
        setOfVowels.addAll(Arrays.asList('a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'U', 'I'));

        StringBuilder result = new StringBuilder();
        for (int c = 0; c < str.length(); c++) {
            result.append(setOfVowels.contains(str.charAt(c)) ? "" : str.charAt(c));
        }

        return result.toString();
    }
}
