package easy;

import java.math.BigInteger;

/**
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int first = a.length() - 1, second = b.length() - 1, carry = 0;
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) sum += a.charAt(first--) - '0';
            if (second >= 0) sum += b.charAt(second--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
