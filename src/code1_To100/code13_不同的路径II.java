package code1_To100;

/**
 * @author ajie
 * @date 2023/3/11
 * @description: https://leetcode.cn/problems/unique-paths-ii/
 */
public class code13_不同的路径II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] paths = new int[width];
        paths[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int i = 0; i < width; i++) {
                if (row[i] == 1) {
                    paths[i] = 0;
                } else if (i > 0) {
                    paths[i] += paths[i - 1];
                }
            }
        }
        return paths[width - 1];
    }
}
