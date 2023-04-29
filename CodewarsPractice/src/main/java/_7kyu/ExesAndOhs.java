package _7kyu;

/**
 * https://www.codewars.com/kata/55908aad6620c066bc00002a
 */
public class ExesAndOhs {
    public static boolean getXO (String str) {
        return str.replace("x", "").length() == str.replace("o", "").length();
    }

    public static boolean getXOAlter (String str) {
        long countOfX = str.toUpperCase().chars().filter(ch -> ch == 'X').count();
        long countOfO = str.toUpperCase().chars().filter(ch -> ch == 'O').count();
        return countOfX == countOfO;
    }

    public static boolean getXOAlterTwo (String str) {
        int countOfX = 0, countOfO = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.toLowerCase().charAt(i) == 'x') countOfX++;
            if (str.toLowerCase().charAt(i) == 'o') countOfO++;
        }
        return countOfX == countOfO;
    }
}
