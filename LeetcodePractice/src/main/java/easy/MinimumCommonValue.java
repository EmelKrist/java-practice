package easy;

/**
 * https://leetcode.com/problems/minimum-common-value/
 */
public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        for (int num : nums1) {
            int start = 0, end = nums2.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums2[mid] == num) return num;
                else if (nums2[mid] > num) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }

    public int getCommonAlter(int[] nums1, int[] nums2) {
        if (nums1[0] > nums2[nums2.length - 1] || nums2[0] > nums1[nums1.length - 1]) return -1;
        int firstIdx = 0, secondIdx = 0;
        while (firstIdx < nums1.length && secondIdx < nums2.length) {
            if (nums1[firstIdx] == nums2[secondIdx]) return nums1[firstIdx];
            else if (nums1[firstIdx] > nums2[secondIdx]) secondIdx++;
            else firstIdx++;
        }
        return -1;
    }
}
