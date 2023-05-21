package _8kyu;

import java.util.stream.Collectors;

/**
 * codewars.com/kata/56b1f01c247c01db92000076
 */
public class DoubleChar {

    public static String doubleChar(String s) {
        return s.replaceAll(".", "$0$0");
    }

    public static String doubleCharAlter(String s) {
        return s.chars().mapToObj(i -> Character.toString(i) + Character.toString(i)).collect(Collectors.joining());
    }

    public static String doubleCharAlterTwo(String s) {
        StringBuilder doubleString = new StringBuilder();
        for (char ch : s.toCharArray()) {
            doubleString.append(ch).append(ch);
        }
        return doubleString.toString();
    }
}
