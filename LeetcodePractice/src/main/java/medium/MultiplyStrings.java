package medium;

/**
 * https://leetcode.com/problems/multiply-strings/
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        int fLen = num1.length(), sLen = num2.length();
        int[] pos = new int[fLen + sLen];

        for (int i = fLen - 1; i >= 0; i--) {
            for (int j = sLen - 1; j >= 0; j--) {
                int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = multiply + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int p : pos) {
            if (!(sb.length() == 0 && p == 0)) sb.append(p);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
