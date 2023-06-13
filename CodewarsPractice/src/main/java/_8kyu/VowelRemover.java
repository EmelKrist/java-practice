package _8kyu;

/**
 * https://www.codewars.com/kata/5547929140907378f9000039
 */
public class VowelRemover {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }

    public static String shortcutAlter(String input) {
        StringBuilder word = new StringBuilder();
        String vowels = "aeiou";
        for (int i = 0; i < input.length(); i++) {
            if (!vowels.contains(String.valueOf(input.charAt(i))))
                word.append(input.charAt(i));
        }
        return word.toString();
    }
}
