package easy;

/**
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 */
public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder firstWordBuilder = new StringBuilder();
        for (String partOfWord : word1) {
            firstWordBuilder.append(partOfWord);
        }

        StringBuilder secondWordBuilder = new StringBuilder();
        for (String partOfWord : word2) {
            secondWordBuilder.append(partOfWord);
        }

        return firstWordBuilder.toString().equals(secondWordBuilder.toString());
    }
}
