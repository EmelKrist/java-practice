package _6kyu;

/**
 * https://www.codewars.com/kata/538ae2eb7a4ba8c99b000439
 */
public class EvilAutocorrectPrank {

    public static String autocorrect(String input) {
        String autocorrectedInput = input.replaceAll("\\b[yY]o[uU]+\\b", "your sister").replaceAll("\\b[uU]\\b", "your sister");
        return autocorrectedInput;
    }

    public static String alterAutocorrect(String input) {
        return input.replaceAll("(?i)\\b(u|you+)\\b", "your sister");
    }
}
