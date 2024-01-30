package easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number
 */
public class HowManyNumbersAreSmaller {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] arrayCopy = Arrays.copyOf(nums, len);
        quickSort(arrayCopy, 0, len - 1);

        List<Integer> numsList = new ArrayList<>();
        for (int element : arrayCopy) {
            numsList.add(element);
        }

        for (int i = 0; i < len; i++) {
            nums[i] = numsList.indexOf(Array.get(nums, i));
        }

        return nums;
    }

    public int[] smallerNumbersThanCurrentAlter(int[] nums) {
        int len = nums.length;
        int[] resultArray = new int[len];

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if (nums[i] > nums[j]) {
                    resultArray[i]++;
                }
            }
        }

        return resultArray;
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
