package easy;

/**
 * https://leetcode.com/problems/find-the-highest-altitude/
 */
public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int largestAltitude = 0, altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if (largestAltitude < altitude) largestAltitude = altitude;
        }
        return largestAltitude;
    }
}
