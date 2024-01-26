package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-number-game/
 */
public class MinimumNumberGame {
    public static int[] numberGame(int[] nums) {
        int len = nums.length;
        mergeSort(nums, 0, len - 1);
        int[] resultingArray = new int[len];
        for (int i = 0; i < len - 1; i += 2) {
            resultingArray[i] = nums[i + 1];
            resultingArray[i + 1] = nums[i];
        }
        return resultingArray;
    }

    public static int[] numberGameAlter(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < len - 1; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }

        return nums;
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int lenLeft = mid - left + 1;
        int lenRight = right - mid;

        // Создаем временные массивы для хранения значений левой и правой частей
        int[] leftArray = new int[lenLeft];
        int[] rightArray = new int[lenRight];

        // Копируем данные во временные массивы
        for (int i = 0; i < lenLeft; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < lenRight; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Слияние временных массивов обратно в основной массив
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

        // Оставшиеся элементы во временных массивах копируются обратно в основной массив
        while (i < lenLeft) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < lenRight) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
