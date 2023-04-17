package _7kyu;

/**
 * https://www.codewars.com/kata/597bb84522bc93b71e00007e
 */
public class StringMerge {
    public static String stringMerge(String s1, String s2, char letter) {
        return s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }
}
