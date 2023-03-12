package code1_To100;

/**
 * @author ajie
 * @date 2023/3/12
 * @description: https://leetcode.cn/problems/climbing-stairs/
 */
public class code15_爬楼梯 {
    /**
     * 使用两个变量分别存储当前位置的数，和前一个位置的数
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int last = 1, cur = 1;
        for (int i = 2; i <= n; i++) {
            int temp = cur;
            cur = last + cur;
            last = temp;
        }
        return cur;
    }

    /**
     * 使用一个数组保存访问过的值
     *
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        int[] stair = new int[n + 1];
        stair[0] = 1;
        stair[1] = 2;
        for (int i = 2; i <= n; i++) {
            stair[i] = stair[i - 1] + stair[i - 2];
        }
        return stair[n];
    }

    /**
     * 使用递归求解
     *
     * @param n
     * @return
     */
    public int climbStairs3(int n) {
        if (n <= 1) {
            return 1;
        }
        return climbStairs3(n - 1) + climbStairs3(n - 2);
    }


}
