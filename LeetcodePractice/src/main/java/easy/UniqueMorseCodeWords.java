package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-morse-code-words/
 */
public class UniqueMorseCodeWords {

    private final String[] morseRepresentationOfLetters =
            {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                    "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueMorseWords = new HashSet<>();
        for (String word : words) {
            uniqueMorseWords.add(encodeToMorse(word));
        }
        return uniqueMorseWords.size();
    }

    private String encodeToMorse(String word) {
        StringBuilder encodingBuilder = new StringBuilder();
        for(char character : word.toCharArray()) {
            encodingBuilder.append(morseRepresentationOfLetters[character - 'a']);
        }
        return encodingBuilder.toString();
    }
}
