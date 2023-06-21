package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/description/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, j = m; i < n; i++) {
            nums1[j] = nums2[i];
            j++;
        }
        Arrays.sort(nums1);
    }

    public void mergeAlter(int[] nums1, int m, int[] nums2, int n) {
        int[] mergeNums = new int[m + n];
        int idx1 = 0, idx2 = 0, idx3 = 0;
        while (idx1 < m || idx2 < n) {
            if (idx1 == m) {
                mergeNums[idx3++] = nums2[idx2++];
                continue;
            }
            if (idx2 == n) {
                mergeNums[idx3++] = nums1[idx1++];
                continue;
            }
            if (nums1[idx1] < nums2[idx2]) {
                mergeNums[idx3++] = nums1[idx1++];
            } else {
                mergeNums[idx3++] = nums2[idx2++];
            }
        }
        System.arraycopy(mergeNums, 0, nums1, 0, mergeNums.length);
    }
}
