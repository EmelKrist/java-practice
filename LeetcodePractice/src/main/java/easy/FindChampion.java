package easy;

/**
 * https://leetcode.com/problems/find-champion-i/
 */

import java.util.Arrays;

public class FindChampion {
    public int findChampion(int[][] grid) {
        int team = 0, maxWins = 0;
        int teamsCount = grid.length;

        for (int i = 0; i < teamsCount; i++) {
            int teamWins = Arrays.stream(grid[i]).sum();
            if (grid[i][i] == 1) teamWins--;

            if (teamWins > maxWins) {
                maxWins = teamWins;
                team = i;
            }
        }
        return team;
    }
}
