package _7kyu;

/**
 * https://www.codewars.com/kata/55960bbb182094bc4800007b
 */
public class InsertDashes {
    public static String insertDash(int num) {
        StringBuilder result = new StringBuilder();
        String strNum = String.valueOf(num);
        for (int i = 0; i < strNum.length() - 1; i++){
            result.append(strNum.charAt(i));
            if (strNum.charAt(i) % 2 == 1 && strNum.charAt(i + 1) % 2 == 1){
                result.append("-");
            }
        }
        return result.append(strNum.charAt(strNum.length() - 1)).toString();
    }

    public static String insertDashAlter(int num) {
        return String.valueOf(num).replaceAll("[13579](?=[13579])", "$0-");
    }

}
