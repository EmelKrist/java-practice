package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-array-by-parity
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int[] evenNums = new int[len];
        int[] oddNums = new int[len];
        int evenLen = 0, oddLen = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                evenNums[evenLen++] = num;
            } else {
                oddNums[oddLen++] = num;
            }
        }

        mergeSort(evenNums, 0, evenLen - 1);
        mergeSort(oddNums, 0, oddLen - 1);

        int k = 0;
        for (int i = 0; i < evenLen; i++) {
            nums[k++] = evenNums[i];
        }

        for (int i = 0; i < oddLen; i++) {
            nums[k++] = oddNums[i];
        }

        return nums;
    }

    public int[] sortArrayByParityAlter(int[] nums) {
        int len = nums.length;
        int even = 0, odd = len - 1;
        int[] sortedNums = new int[len];
        for (int num : nums) {
            if (num % 2 == 0) {
                sortedNums[even++] = num;
            } else {
                sortedNums[odd--] = num;
            }
        }

        return sortedNums;
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private void merge(int[]array, int left, int mid, int right) {
        int lenLeft = mid - left + 1;
        int lenRight = right - mid;

        int[] leftArray = new int[lenLeft];
        int[] rightArray = new int[lenRight];

        for(int i = 0; i < lenLeft; i++) {
            leftArray[i] = array[left + i];
        }

        for(int j = 0; j < lenRight; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < lenLeft && j < lenRight) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < lenLeft) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < lenRight) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
