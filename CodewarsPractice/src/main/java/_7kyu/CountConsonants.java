package _7kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://www.codewars.com/kata/564e7fc20f0b53eb02000106
 */
public class CountConsonants {

    public static int getCount(String str) {
        String vowels = "aouie";
        int consonants = 0;
        for (char c: str.toLowerCase().toCharArray()){ // массив символов строки в нижнем регистре
            // если символ является буквой и не является гласной, то это согласная
            if (c >= 'a' && c <= 'z' && vowels.indexOf(c) == -1) consonants++;
        }
        return consonants;
    }

    public static int getCountAlter(String str) {
        return str.replaceAll("(?i)[^a-z]|[aouie]", "").length();
    }

    public static int getCountAlterTwo(String str) {
        List<Integer> vowels = new ArrayList<>(Arrays.asList((int)'a',(int)'e',(int)'i',(int)'o',(int)'u'));
        return (int) str.chars().filter(Character::isLetter).filter(i-> !vowels.contains(i)).count();
    }

}
