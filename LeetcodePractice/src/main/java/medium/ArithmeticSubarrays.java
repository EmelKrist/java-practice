package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/arithmetic-subarrays/
 */
public class ArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n = l.length;
        List<Boolean> checkingList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] checkedSubarray = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            checkingList.add(isArithmeticSubarray(checkedSubarray));
        }
        return checkingList;
    }

    private boolean isArithmeticSubarray(int[] checkedSubarray) {
        int len = checkedSubarray.length;
        if (len < 2) return true;
        Arrays.sort(checkedSubarray);
        int difference = checkedSubarray[1] - checkedSubarray[0];
        for (int i = 2; i < len; i++) {
            if (checkedSubarray[i] - checkedSubarray[i - 1] != difference) return false;
        }
        return true;
    }
}
