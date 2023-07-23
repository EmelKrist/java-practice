package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(List.of(List.of(1)));
        if (numRows == 1) return triangle;

        triangle.add(List.of(1, 1));
        while (triangle.size() <= numRows) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> lastRow = triangle.get(triangle.size() - 1);
            for (int i = 0; i < lastRow.size() - 1; i++) {
                row.add(lastRow.get(i) + lastRow.get(i + 1));
            }
            row.add(1);
            triangle.add(row);
        }

        return triangle;

    }
}
