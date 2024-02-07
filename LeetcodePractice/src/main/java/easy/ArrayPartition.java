package easy;

/**
 * https://leetcode.com/problems/array-partition/
 */
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n - 1);
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int lenLeft = mid - left + 1;
        int lenRight = right - mid;

        int[] leftArray = new int[lenLeft];
        int[] rightArray = new int[lenRight];

        for (int i = 0; i < lenLeft; i++) {
            leftArray[i] = array[left + i];
        }

        for (int i = 0; i < lenRight; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, cur = left;
        while (i < lenLeft && j < lenRight) {
            if (leftArray[i] <= rightArray[j]) {
                array[cur] = leftArray[i];
                i++;
            } else {
                array[cur] = rightArray[j];
                j++;
            }
            cur++;
        }

        while (i < lenLeft) {
            array[cur] = leftArray[i];
            i++;
            cur++;
        }

        while (j < lenRight) {
            array[cur] = rightArray[j];
            j++;
            cur++;
        }
    }
}
