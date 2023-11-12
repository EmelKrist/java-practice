package easy;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        String binaryRepresent = Integer.toBinaryString(n);
        int i = 0, j = binaryRepresent.length() - 1, hammingWeight = 0;
        while (i <= j) {
            if (binaryRepresent.charAt(i) == '1') hammingWeight++;
            if (i != j && binaryRepresent.charAt(j) == '1') hammingWeight++;
            i++; j--;
        }
        return hammingWeight;
    }
}
