package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
 */
public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        Set<Character> allowedSet = new HashSet<>();
        for (char character : allowed.toCharArray()) {
            allowedSet.add(character);
        }

        for(String word : words) {
            boolean isConsistent = true;
            for(char letter : word.toCharArray()) {
                if (!allowedSet.contains(letter)) {
                    isConsistent= false;
                    break;
                }
            }
            if (isConsistent) count++;
        }
        return count;
    }
}
