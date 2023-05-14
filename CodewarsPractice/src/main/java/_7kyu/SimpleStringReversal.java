package _7kyu;

/**
 * https://www.codewars.com/kata/5a8d1c82373c2e099d0000ac
 */
public class SimpleStringReversal {
    public static String solve(String s, int a, int b){
        String sub, end = "";
        if (b >= s.length() - 1) {
            sub = s.substring(a);
        } else {
            sub = s.substring(a, b + 1);
            end = s.substring(b + 1);
        }

        return s.substring(0, a) + new StringBuilder(sub).reverse() + end;
    }
}
