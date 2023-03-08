package _8kyu;

/*
https://www.codewars.com/kata/5168bb5dfe9a00b126000018
 */
public class ReversedStrings {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String solutionAlter(String str) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = str.length() - 1; i >=0 ; i--){
            reverseString.append(str.charAt(i));
        }
        return reverseString.toString();
    }
}
