package easy;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new LinkedList<>();
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) disappearedNumbers.add(i + 1);
        }

        return disappearedNumbers;
    }

    private void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] == nums[correct]) {
                i++;
            } else {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
