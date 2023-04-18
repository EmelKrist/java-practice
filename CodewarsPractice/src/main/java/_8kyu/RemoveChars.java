package _8kyu;

/**
 * https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0
 */
public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String removeAlter(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++){
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static String removeAlterTwo(String str) {
        return str.replaceAll("^.|.$", "");
    }
}
