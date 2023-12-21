package easy;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> uniqueNums1 = new HashSet<>();
        Set<Integer> uniqueNums2 = new HashSet<>();

        for(int num : nums1) {
            uniqueNums1.add(num);
        }

        for(int num : nums2) {
            if(uniqueNums1.contains(num)) uniqueNums2.add(num);
        }

        int[] intersectionArray = new int[uniqueNums2.size()];
        int index = 0;
        for(Integer uniqueNum : uniqueNums2) {
            intersectionArray[index++] = uniqueNum;
        }
        return intersectionArray;
    }
}
