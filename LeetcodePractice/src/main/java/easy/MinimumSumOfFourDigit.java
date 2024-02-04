package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits
 */
public class MinimumSumOfFourDigit {
    public int minimumSum(int num) {
        List<Integer> nums = new ArrayList<>();
        int k = num;
        while (k != 0) {
            nums.add(k % 10);
            k /= 10;
        }
        mergeSort(nums, 0, nums.size() - 1);
        return (nums.get(0) * 10 + nums.get(3)) + (nums.get(1) * 10 + nums.get(2));
    }

    private void mergeSort(List<Integer> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);

            merge(list, left, mid, right);
        }
    }

    private void merge(List<Integer> list, int left, int mid, int right) {
        int lenLeft = mid - left + 1;
        int lenRight = right - mid;

        int[] leftArray = new int[lenLeft];
        int[] rightArray = new int[lenRight];

        for(int i = 0; i < lenLeft; i++) {
            leftArray[i] = list.get(left + i);
        }

        for(int j = 0; j < lenRight; j++) {
            rightArray[j] = list.get(mid + 1 + j);
        }

        int i = 0, j = 0, k = left;
        while (i < lenLeft && j < lenRight) {
            if (leftArray[i] <= rightArray[j]) {
                list.set(k, leftArray[i]);
                i++;
            } else {
                list.set(k, rightArray[j]);
                j++;
            }
            k++;
        }

        while (i < lenLeft) {
            list.set(k, leftArray[i]);
            i++;
            k++;
        }

        while (j < lenRight) {
            list.set(k, rightArray[j]);
            j++;
            k++;
        }
    }
}
