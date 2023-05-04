package _7kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/594b8e182fa0a0d7fc000875
 */
public class WithoutTheLetterE {
    public static String findE(String str){
        if (str == null || str.isEmpty()) return str;
        int countOfE = (int) str.chars().filter(ch -> ch == 'e' || ch == 'E').count();
        return countOfE < 1 ? "There is no \"e\"." : String.valueOf(countOfE);
    }

    public static String findEAlter(String str){
        if (str == null || str.isEmpty()) return str;
        int countOfE = str.replaceAll("[^eE]", "").length();
        return countOfE < 1 ? "There is no \"e\"." : String.valueOf(countOfE);
    }
}
