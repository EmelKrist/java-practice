package easy;

/**
 * https://leetcode.com/problems/third-maximum-number/
 */
public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        long m1 = Long.MIN_VALUE, m2 = Long.MIN_VALUE, m3 = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > m1)  {
                m3 = m2;
                m2 = m1;
                m1 = num;
            } else if (num > m2 && num != m1) {
                m3 = m2;
                m2 = num;
            } else if (num > m3 && num != m2 && num != m1) {
                m3 = num;
            }
        }

        return m3 == Long.MIN_VALUE ? (int) m1 : (int) m3;
    }

    public static int thirdMaxAlter(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[max] < nums[j]) max = j;
            }
            int temp = nums[i];
            nums[i] = nums[max];
            nums[max] = temp;
        }
        int max = nums[0];
        int count = 1; // количество найденных максимальных
        if (nums.length > 2) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < max && count < 3) {
                    max = nums[i];
                    count++;
                }
            }

            if (count != 3){
                max = nums[0];
            }
        }

        return max;
    }
}
