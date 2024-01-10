package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
 */
public class WidestVerticalArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xPoints = Arrays.stream(points).mapToInt(point -> point[0]).sorted().toArray();
        int maxWide = xPoints[1] - xPoints[0];
        for(int i = 1; i < xPoints.length - 1; i++) {
            maxWide = Math.max(maxWide, xPoints[i + 1] - xPoints[i]);
        }
        return maxWide;
    }
}
