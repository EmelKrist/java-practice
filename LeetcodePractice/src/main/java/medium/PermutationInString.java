package medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/permutation-in-string/
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        String sortedS1 = new String(s1Array);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String sub = s2.substring(i, i + s1.length());
            char[] subArray = sub.toCharArray();
            Arrays.sort(subArray);
            String sortedSub = new String(subArray);
            if (sortedSub.equals(sortedS1)) return true;
        }

        return false;
    }
}
