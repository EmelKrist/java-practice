package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-case-permutation/
 */
public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> listOfStrings = new ArrayList<>();
        subset(listOfStrings, 0, s.toCharArray());
        return listOfStrings;
    }

    private void subset(List listOfStrings, int index, char[] arrayOfSymbols) {
        if (index == arrayOfSymbols.length) {
            listOfStrings.add(String.valueOf(arrayOfSymbols));
            return;
        }

        char lowerCaseOfSymbol = ("" + arrayOfSymbols[index]).toLowerCase().charAt(0);
        char upperCaseOfSymbol = ("" + arrayOfSymbols[index]).toUpperCase().charAt(0);

        if (lowerCaseOfSymbol != upperCaseOfSymbol) {
            arrayOfSymbols[index] = upperCaseOfSymbol;
            subset(listOfStrings, index + 1, arrayOfSymbols);
            arrayOfSymbols[index] = lowerCaseOfSymbol;
        }
        subset(listOfStrings, index + 1, arrayOfSymbols);
    }

}
