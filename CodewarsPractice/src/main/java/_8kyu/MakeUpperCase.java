package _8kyu;

/**
 * https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/train/java
 */
public class MakeUpperCase {
    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }

    public static String MakeUpperCaseAlter(String str){
        StringBuilder upString = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            upString.setCharAt(i, Character.toUpperCase(str.charAt(i)));
        }
        return upString.toString();
    }
}
