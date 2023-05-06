package _6kyu;

/**
 * https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991
 */
public class ReverseOrRotate {
    public static String revRot(String strng, int sz) {
        if (strng.length() < sz | sz <= 0 | strng.isEmpty()) return "";
        StringBuilder result = new StringBuilder();
        while (strng.length() >= sz) {
            String chunk = strng.substring(0, sz);
            result.append(sumOfCubesDivisibleByTwo(chunk) ? reverse(chunk) : rotate(chunk));
            strng = strng.substring(sz);
        }
        return result.toString();
    }

    public static boolean sumOfCubesDivisibleByTwo(String str) {
        long sumOfCubes = 0L;
        for (char ch : str.toCharArray()) {
            sumOfCubes += Character.getNumericValue(ch);
        }
        return sumOfCubes % 2 == 0;
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String rotate(String str) {
        return str.substring(1) + str.charAt(0);
    }
}
