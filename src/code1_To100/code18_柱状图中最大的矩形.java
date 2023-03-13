package code1_To100;

/**
 * @author ajie
 * @date 2023/3/13
 * @description: https://leetcode.cn/problems/largest-rectangle-in-histogram/
 */
public class code18_柱状图中最大的矩形 {
    /**
     * 1.使用暴力解法，找到当前柱子的高度下的左边界和有边界
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int res = 0;
        if (len == 0) {
            return 0;
        }
        for (int i = 0; i < len; i++) {
            //找到左边比当前柱子高度底的下标
            int left = i;
            int curHeight = heights[i];
            while (left > 0 && heights[left - 1] >= curHeight) {
                left--;
            }

            //找到右边比当前柱子高度底的下标
            int right = i;
            while (right < len - 1 && heights[right + 1] >= curHeight) {
                right++;
            }
            res = Math.max(res, curHeight * (right - left + 1));
        }
        return res;
    }
}
