package easy;

/**
 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */
public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int maxWordsCount = 0;
        for (String sentence : sentences) {
            int wordsCount = 1;
            for (char symbol : sentence.toCharArray()) {
                if (symbol == ' ') wordsCount++;
            }
            if (wordsCount > maxWordsCount) maxWordsCount = wordsCount;
        }
        return maxWordsCount;
    }
}
