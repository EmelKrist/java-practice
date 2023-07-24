package easy;

/**
 * https://leetcode.com/problems/island-perimeter/
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
            int islandPerimeter = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1) {
                        islandPerimeter += 4;
                        if (i > 0 && grid[i - 1][j] == 1) islandPerimeter--; // проверяем, есть ли остров сверху
                        if (i < grid.length - 1 && grid[i + 1][j] == 1) islandPerimeter--; // проверяем, есть ли остров снизу
                        if (j > 0 && grid[i][j - 1] == 1) islandPerimeter--; // проверяем, есть ли остров слева
                        if (j < grid[i].length - 1 && grid[i][j + 1] == 1) islandPerimeter--; // проверяем, есть ли остров справа
                    }
                }
            }
            return islandPerimeter;
    }
}
