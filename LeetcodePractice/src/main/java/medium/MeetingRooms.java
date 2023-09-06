package medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/meeting-rooms/
 */
public class MeetingRooms {
    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        int last = 0;
        for (int current = 1; current < intervals.length; current++) {
            if (intervals[last][1] > intervals[current][0]) return false;
            else last = current;
        }
        return true;
    }
}
