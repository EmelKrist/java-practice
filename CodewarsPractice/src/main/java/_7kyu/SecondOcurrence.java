package _7kyu;

/**
 * https://www.codewars.com/kata/63f96036b15a210058300ca9
 */
public class SecondOcurrence {

    public static int secondSymbol(String str, char c) {
        if (str.length() == 1 || str.isEmpty()) return -1;
        int indexOfFirst = str.indexOf(c);
        if (indexOfFirst != -1) {
            int secondWithoutFirst = str.substring(indexOfFirst + 1).indexOf(c);
            return secondWithoutFirst != -1 ? secondWithoutFirst + indexOfFirst + 1 : -1;
        }
        return -1;
    }

    public static int secondSymbolAlter(String str, char c) {
        int occurrences = 0;
        for (int i = 0; i < str.length(); i++) {
            occurrences += str.charAt(i) == c ? 1 : 0;
            if (occurrences == 2) return i;
        }
        return -1;
    }

    public static int secondSymbolAlterTwo(String str, char c) {
        int indexOfFirst = str.indexOf(c);
        for (int i = indexOfFirst + 1; i < str.length(); i++) {
            if (str.charAt(i) == c) return i;
        }
        return -1;
    }

}
