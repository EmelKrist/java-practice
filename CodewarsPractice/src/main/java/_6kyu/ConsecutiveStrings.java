package _6kyu;

/**
 * https://www.codewars.com/kata/56a5d994ac971f1ac500003e
 */
public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0) return "";
        StringBuilder consecutiveStrings = new StringBuilder();
        String longestConsecString = "";
        for (int i = 0; i <= strarr.length - k; i++) {
            int next = 0;
            while (next < k) {
                consecutiveStrings.append(strarr[i + next++]);
            }

            if (consecutiveStrings.length() > longestConsecString.length())
                longestConsecString = consecutiveStrings.toString();

            consecutiveStrings.setLength(0);
        }
        return longestConsecString;
    }
}
