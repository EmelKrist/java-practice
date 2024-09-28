package _7kyu;

/**
 * https://www.codewars.com/kata/5390bac347d09b7da40006f6/
 */
public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isBlank()) return null;
        String[] words = phrase.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length());
        }
        return String.join(" ", words);
    }

    public String alterToJadenCase(String phrase) {
        if (phrase == null || phrase.isBlank()) return null;

        char[] chars = phrase.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        return new String(chars);
    }
}
