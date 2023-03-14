package day_code;

/**
 * @author ajie
 * @date 2023/3/14
 * @description: https://leetcode.cn/problems/find-valid-matrix-given-row-and-column-sums/
 */
public class code01_给定行和列的和求可行性矩阵 {
    public static void main(String[] args) {
        int[] rowSum = {5,7,10};
        int[] colSum = {8,6,8};
        restoreMatrix(rowSum, colSum);
    }

    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;

        int[][] matrix = new int[n][m];
        int i = 0, j = 0;
        while (i < n && j < m) {
            int v = Math.min(rowSum[i], colSum[j]);
            matrix[i][j] = v;
            rowSum[i] -= v;
            colSum[j] -= v;
            if (rowSum[i] == 0) {
                ++i;
            }
            if (colSum[j] == 0) {
                ++j;
            }
        }
        return matrix;

    }
}
