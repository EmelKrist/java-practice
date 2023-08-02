package easy;

/**
 * https://leetcode.com/problems/truncate-sentence/
 */
public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        StringBuilder partOfSentence = new StringBuilder();
        int i = 0;
        while (k > 0 && i < s.length()){
            if (s.charAt(i) == ' ') k--;
            partOfSentence.append(s.charAt(i++));
        }
        return partOfSentence.toString().trim();
    }
}
