package _7kyu;

/*
https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d
 */
public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }

    public static boolean solutionAlter(String str, String ending) {
        char[] stringArr = str.toCharArray(), endArr = ending.toCharArray();
        if (stringArr.length < endArr.length) return false;
        for (int i = 0; i < endArr.length; i++) { // просматриваем с конца строку и предполагаемый конец
            if (stringArr[str.length() - 1 - i] != endArr[ending.length() - 1 - i]) return false;
        }
        return true;
    }
}
