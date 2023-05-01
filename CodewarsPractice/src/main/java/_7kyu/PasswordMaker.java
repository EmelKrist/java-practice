package _7kyu;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/5637b03c6be7e01d99000046
 */
public class PasswordMaker {
    public static String makePassword(String phrase){
        return phrase.isEmpty() ? "" :
               Arrays.stream(phrase.split(" "))
               .map(i -> i.charAt(0))
               .map(String::valueOf)
               .collect(Collectors.joining())
               .replaceAll("[iI]", "1")
               .replaceAll("[oO]", "0")
               .replaceAll("[sS]", "5");
    }

    public static String makePasswordAlter(String phrase){
        return phrase.isEmpty() ? "" :
                Stream.of(phrase.split(" "))
                        .map(i -> i.substring(0, 1))
                        .map(i -> i.equalsIgnoreCase("i") ? "1"
                                : i.equalsIgnoreCase("o") ? "0"
                                : i.equalsIgnoreCase("s") ? "5"
                                : i)
                        .collect(Collectors.joining());
    }

    public static String makePasswordAlterTwo(String phrase) {
        return phrase
                .replaceAll("\\s*(\\w)\\w+", "$1")
                .replaceAll("[iI]", "1")
                .replaceAll("[oO]", "0")
                .replaceAll("[sS]", "5");
    }

    public static String makePasswordAlterThree(String phrase) {
        if (phrase.isEmpty()) return "";
        StringBuilder password = new StringBuilder();
        for (String word : phrase.split(" ")){
            String firstLetter = word.substring(0, 1);
            if (firstLetter.equalsIgnoreCase("i")) firstLetter = "1";
            if (firstLetter.equalsIgnoreCase("o")) firstLetter = "0";
            if (firstLetter.equalsIgnoreCase("s")) firstLetter = "5";
           password.append(firstLetter);
        }
        return password.toString();
    }
}
