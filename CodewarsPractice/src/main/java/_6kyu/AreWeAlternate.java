package _6kyu;

/**
 * https://www.codewars.com/kata/59325dc15dbb44b2440000af
 */
public class AreWeAlternate {
    public static boolean isAlt(String word) {
        String vowels = "aouie";
        for (int i = 0; i < word.length() - 1; i++) {
            final boolean currentIsVowel = vowels.contains(Character.toString(word.charAt(i)));
            final boolean nextIsVowel = vowels.contains(Character.toString(word.charAt(i + 1)));
            if ((currentIsVowel && nextIsVowel) || (!currentIsVowel && !nextIsVowel)) return false;
        }
        return true;
    }

    public static boolean isAltAlter(String word) {
        return word.matches("[aeiou]?([^aeiou][aeiou])*[^aeiou]?");
    }
}
