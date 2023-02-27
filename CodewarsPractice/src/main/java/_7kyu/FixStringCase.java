package _7kyu;

/*
https://www.codewars.com/kata/5b180e9fedaa564a7000009a
 */
public class FixStringCase {
    public static String solve(final String str) {
        int countUp = 0;
        for (int c = 0; c < str.length(); c++) {
            if (Character.isUpperCase(str.charAt(c))) countUp++;
        }
        int countLow = str.length() - countUp;
        return countLow >= countUp? str.toLowerCase() : str.toUpperCase();
    }

    public static String solveAlter(final String str){
        return str.chars().filter(Character::isLowerCase).count() >= str.chars().filter(Character::isUpperCase).count()
                ? str.toLowerCase()
                : str.toUpperCase();
    }
}
