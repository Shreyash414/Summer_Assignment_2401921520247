package Week1.Day4;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        int srow = 0, erow = m - 1;
        int scol = 0, ecol = n - 1;

        while (srow <= erow && scol <= ecol) {

            // Left -> Right
            for (int i = scol; i <= ecol; i++) {
                ans.add(matrix[srow][i]);
            }

            // Top -> Bottom
            for (int i = srow + 1; i <= erow; i++) {
                ans.add(matrix[i][ecol]);
            }

            // Right -> Left
            if (srow < erow) {
                for (int i = ecol - 1; i >= scol; i--) {
                    ans.add(matrix[erow][i]);
                }
            }

            // Bottom -> Top
            if (scol < ecol) {
                for (int i = erow - 1; i > srow; i--) {
                    ans.add(matrix[i][scol]);
                }
            }

            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return ans;
    }
}
