package _7kyu;

import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/54ba84be607a92aa900000f1
 */
public class Isograms {
    public static boolean  isIsogram(String str) {
        return str.toLowerCase().chars().boxed().collect(Collectors.toSet()).size() == str.length();
    }

    public static boolean  isIsogramAlter(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    }

    public static boolean  isIsogramAlterTwo(String str) {
        return str.toLowerCase().matches("(?:([a-z])(?!.*\\1))*");
    }
}
