package _8kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
 */
public class Abbreviate {
    public static String abbrevName(String name) {
        String[] words = name.split(" ");
        return words[0].substring(0, 1).toUpperCase() + "." + words[1].substring(0, 1).toUpperCase();
    }

    public static String abbrevNameAlter(String name) {
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }

    public static String abbrevNameAlterTwo(String name) {
        return Arrays.stream(name.split(" "))
                .map(String::toUpperCase)
                .map(i -> i.substring(0,1))
                .collect(Collectors.joining("."));
    }
}
