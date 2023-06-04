package _8kyu;

/**
 * https://www.codewars.com/kata/53dc23c68a0c93699800041d
 */
public class SentenceSmash {
    public static String smash(String... words) {
        StringBuilder smashString = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            smashString.append(" ").append(words[i]);
        }

        return smashString.toString().trim();
    }

    public static String smashAlter(String... words) {
        return String.join(" ", words);
    }
}
