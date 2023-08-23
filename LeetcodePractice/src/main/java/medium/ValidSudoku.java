package medium;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        var seen = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c == '.') continue;
                if (!seen.add(c + "@row" + row) ||
                    !seen.add(c + "@col" + col) ||
                    !seen.add(c + "@box" + row/3 + col/3))
                    return false;
            }
        }
        return true;
    }
}
