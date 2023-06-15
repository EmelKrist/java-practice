package _7kyu;

/**
 * https://www.codewars.com/kata/5a9e86705ee396d6be000091
 */
public class CheckThreeAndTwo {
    public boolean checkThreeAndTwo(char[] chars) {
        int a = 0, b = 0, c = 0;
        for (char ch : chars) {
            if (ch == 'a') a++;
            else if (ch == 'b') b++;
            else if (ch == 'c') c++;
        }
        String result = a + " " + b + " " + c;
        return result.contains("2") && result.contains("3");
    }
}
