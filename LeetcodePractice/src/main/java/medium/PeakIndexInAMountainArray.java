package medium;

/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        while (left < arr.length) {
            if (arr[left] < arr[left + 1]) {
                left++;
            } else {
                return left;
            }
        }
        return -1;
    }

    public int peakIndexInMountainArrayAlter(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
