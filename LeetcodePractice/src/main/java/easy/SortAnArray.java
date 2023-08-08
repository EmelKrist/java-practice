package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-an-array/
 */
public class SortAnArray {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, nums.length);
    }

    private int[] mergeSort(int[] nums, int n) {
        if (n < 2) return nums;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = nums[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = nums[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        return merge(nums, r, l, mid, n - mid);
    }

    private int[] merge(int[] array, int[] right, int[] left, int leftLen, int rightLen) {
        int iA = 0, iR = 0, iL = 0;
        while (iL < leftLen && iR < rightLen) {
            if (left[iL] < right[iR]) {
                array[iA++] = left[iL++];
            } else {
                array[iA++] = right[iR++];
            }
        }

        while (iL < leftLen) {
            array[iA++] = left[iL++];
        }

        while (iR < rightLen) {
            array[iA++] = right[iR++];
        }

        return array;
    }
}
