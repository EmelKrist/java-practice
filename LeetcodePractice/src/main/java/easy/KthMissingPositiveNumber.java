package easy;

/**
 * https://leetcode.com/problems/kth-missing-positive-number
 */
public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int lenOfArr = arr.length;
        int[] nums = new int[2002];
        for (int i = 0; i < lenOfArr; i++) {
            nums[i] = arr[i];
        }

        cyclicSort(nums, lenOfArr);

        for (int i = 0; i < nums.length; i++) {
            int correctIndex = nums[i] - 1;
            if (k == 1 && correctIndex != i) return i + 1;
            if (correctIndex != i) k--;
        }
        return -1;
    }

    private void cyclicSort(int[] nums, int length) {
        int i = 0;
        while (i < length) {
            int correctIndex = nums[i] - 1;
            if (correctIndex >= 0 && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
}
