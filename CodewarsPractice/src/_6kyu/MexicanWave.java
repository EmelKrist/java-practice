package _6kyu;

/*
https://www.codewars.com/kata/58f5c63f1e26ecda7e000029
 */
public class MexicanWave {
    public static void main(String[] args) {
        wave("two words").toString();
    }

    public static String[] wave(String str) {
        String[] strArr = new String[str.replaceAll(" ", "").length()];
        StringBuilder sb = new StringBuilder();
        int arrIndex = 0;
        for (int strIndex = 0; strIndex < str.length(); strIndex++) {
            if (!String.valueOf(str.charAt(strIndex)).equals(" ")) {
                sb.append(str);
                sb.setCharAt(strIndex, Character.toUpperCase(str.charAt(strIndex)));
                strArr[arrIndex++] = sb.toString();
                sb.setLength(0);
            } else continue;
        }
        return strArr;
    }
}
