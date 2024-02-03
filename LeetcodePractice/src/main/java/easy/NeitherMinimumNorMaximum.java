package easy;

/**
 * https://leetcode.com/problems/neither-minimum-nor-maximum
 */
public class NeitherMinimumNorMaximum {
    public int findNonMinOrMax(int[] nums) {
        int len = nums.length;
        if (len < 3) return -1;
        quickSort(nums, 0, len - 1);
        for (int i = 1; i < len - 1; i++) {
            if (nums[i] != nums[0]) {
                return nums[i];
            }
        }
        return -1;
    }

    public int findNonMinOrMaxAlter(int[] nums) {
        int len = nums.length;
        if (len < 3) return -1;
        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            else if (num > max) max = num;
        }

        for (int num : nums) {
            if (num != min && num != max) return num;
        }

        return -1;
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
}
