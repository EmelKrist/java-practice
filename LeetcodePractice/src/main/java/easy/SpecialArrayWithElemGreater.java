package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x
 */
public class SpecialArrayWithElemGreater {
    public int specialArray(int[] nums) {
        int len = nums.length;
        quickSort(nums, 0, len - 1);
        int left = 0, right = 100;
        while (left < right) {
            int mid = (left + right) >> 1;
            int count = 0;
            for (int num : nums) {
                if (num > mid) count++;
            }

            if (count > mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int count = 0;
        for (int num : nums) {
            if (num >= left) count++;
        }

        return count == left ? left : -1;
    }


    private void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public int specialArrayAlter(int[] nums) {
        int left = 0, right = nums.length;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int count = getCount(nums, middle);
            if (count > middle) {
                left = middle + 1;
            } else if (count < middle) {
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return -1; // if not found
    }

    private int getCount(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num >= target) count++;
        }
        return count;
    }
}
