package javaCode.ArrayProblem;

import java.util.ArrayList;

public class SpiralMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length;
        if (row == 0)
            return list;
        int col = matrix[0].length;

        int top = 0, bottom = row - 1, left = 0, right = col - 1, d = 0;
        while (top <= bottom && left <= right) {
            if (d == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                d = 1;
                top++;

            } else if (d == 1) {
                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);
                }
                d = 2;
                right--;

            } else if (d == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                d = 3;
                bottom--;
            } else if (d == 3) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);

                }
                d = 0;
                left++;

            }
        }
        return list;

    }
}
