package javaCode.ArrayProblem;
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
class CellsWithOddValue {
    public int oddCells(int m, int n, int[][] indices) {

        int[][] matrix = new int[m][n]; // initialised a (m x n) array

        // incrementing the matrix
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for (int j = 0; j < n; j++) {
                matrix[row][j]++; // every element of rowth row is incremented as j++ over the column
            }
            for (int k = 0; k < m; k++) {
                matrix[k][col]++; // every element of colth col is incremented as k++ over the row
            }
        }

        // finding odd numbers
        int count = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] % 2 != 0) {
                    count++;
                }

            }
        }
        return count;
    }
}
