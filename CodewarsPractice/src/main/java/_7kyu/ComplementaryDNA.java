package _7kyu;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/554e4a2f232cdd87d9000038
 */
public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        StringBuilder result = new StringBuilder(dna);
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'A':
                    result.setCharAt(i, 'T');
                    break;
                case 'T':
                    result.setCharAt(i, 'A');
                    break;
                case 'C':
                    result.setCharAt(i, 'G');
                    break;
                case 'G':
                    result.setCharAt(i, 'C');
                    break;
            }
        }
        return result.toString();
    }

    public static String makeComplementAlter(String dna) {
        return dna.replaceAll("A", "-")
                .replaceAll("T", "A")
                .replaceAll("-", "T")
                .replaceAll("C", "-")
                .replaceAll("G", "C")
                .replaceAll("-", "G");
    }

    public static String makeComplementAlterTwo(String dna) {
        Map<Character, String> dnaMap = new HashMap<>();
        dnaMap.put('A', "T");
        dnaMap.put('T', "A");
        dnaMap.put('C', "G");
        dnaMap.put('G', "C");

        return dna.chars().mapToObj(l -> dnaMap.get((char)l)).collect(Collectors.joining());
    }

}
