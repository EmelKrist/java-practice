package easy;

/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist
 */
public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        mergeSort(arr, 0, n - 1);

        int zeroIndex = binarySearch(arr, 0, n - 1, 0);
        if (zeroIndex != -1) {
            if (zeroIndex - 1 >= 0 && arr[zeroIndex - 1] == 0
                    || zeroIndex + 1 < n && arr[zeroIndex + 1] == 0) {
                return true;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            int result = binarySearch(arr, 0, n - 1, arr[i] * 2);
            if (result != -1 && result != i) return true;
        }
        return false;
    }

    private int binarySearch(int[] array, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = array[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            mergeSort(array, left, pivotIndex - 1);
            mergeSort(array, pivotIndex + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (pivot > array[j]) {
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
