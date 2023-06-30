package easy;

/**
 * https://leetcode.com/problems/remove-trailing-zeros-from-a-string/
 */
public class RemoveTrailingZerosFromString {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder(num);
        int idx = num.length() - 1;
        while (sb.charAt(idx) == '0') {
            sb.deleteCharAt(idx--);
        }
        return sb.toString();
    }

    public String removeTrailingZerosAlter(String num) {
        int idx = num.length() - 1;
        while (num.charAt(idx) == '0') {
            idx--;
        }
        return num.substring(0, idx + 1);
    }
}
