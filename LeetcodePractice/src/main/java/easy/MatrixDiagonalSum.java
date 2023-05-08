package easy;

/**
 * https://leetcode.com/problems/matrix-diagonal-sum/
 */
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int diagonalSum = 0, len = mat.length;
        for (int i = 0; i < len; i++) {
            diagonalSum += mat[i][i] + mat[i][len - 1 - i];
        }
        if (len % 2 == 1) {
            diagonalSum -= mat[len / 2][len / 2];
        }
        return diagonalSum;
    }
}
