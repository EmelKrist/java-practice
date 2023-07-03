package _8kyu;

import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/57eae65a4321032ce000002d
 */
public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder(numberString);
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, Character.getNumericValue(sb.charAt(i)) < 5 ? '0' : '1');
        }
        return sb.toString();
    }

    public static String fakeBinAlter(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[^0]", "1");
    }

    public static String fakeBinAlterTwo(String numberString) {
        return numberString.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(Collectors.joining());
    }

    public static String fakeBinAlterThree(String numberString) {
        char[] chars = numberString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = chars[i] < '5' ? '0' : '1';
        }
        return new String(chars);
    }

}
