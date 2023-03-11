package code1_To100;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/3/11
 * @description: https://leetcode.cn/problems/unique-paths/description/
 */
public class code12_不同的路径I {

    public static void main(String[] args) {
        uniquePaths(3, 3);
    }

    /**
     * 存储一维数组优化空间
     *
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths2(int m, int n) {
        int[] paths = new int[n];
        Arrays.fill(paths, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[j] += paths[j - 1];
            }
        }
        return paths[n - 1];
    }


    /**
     * 下一格的路径是上一格的路径之和
     *
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        for (int i = 0; i < m; ++i) {
            paths[i][0] = 1;
        }
        for (int i = 1; i < n; ++i) {
            paths[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }
        return paths[m - 1][n - 1];
    }
}
