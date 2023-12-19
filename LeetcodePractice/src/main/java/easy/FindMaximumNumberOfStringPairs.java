package easy;

/**
 * https://leetcode.com/problems/find-maximum-number-of-string-pairs/
 */
public class FindMaximumNumberOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        int numberOfStringPairs = 0;
        int n = words.length;
        for(int i = 0; i < n - 1; i++) {
            String reverseWord = reverse(words[i]);
            for(int j = i + 1; j < n; j++) {
                if (reverseWord.equals(words[j])) {
                    numberOfStringPairs++;
                    break;
                }
            }
        }
        return numberOfStringPairs;
    }

    private String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
