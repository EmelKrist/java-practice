package medium;

/**
 * https://leetcode.com/problems/circular-array-loop/
 * Cycle in a Circular Array
 */
public class CircularArrayLoop {
    public static boolean circularArrayLoop(int[] nums) {
        int fast, slow;
        fast = slow = 0;

        do {
            slow = move(nums, slow);
            fast = move(nums, move(nums, fast));
        } while (fast != slow);

        return slow == 0;
    }

    private static int move(int[] nums, int movement) {
        int movesCount = nums[movement], resultIdx = 0, len = nums.length;

        int offset = movement + movesCount;
        if (offset > len) {
            resultIdx = offset - len;
        } else if (offset < 0) {
            resultIdx = len + offset;
        } else if (offset == len) {
            resultIdx = 1;
        } else {
            resultIdx = offset;
        }

        return resultIdx;
    }
}
