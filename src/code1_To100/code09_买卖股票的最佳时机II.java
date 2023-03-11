package code1_To100;

/**
 * @author ajie
 * @date 2023/3/9
 * @description: https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class code09_买卖股票的最佳时机II {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                total += (prices[i] - prices[i - 1]);
            }
        }
        return total;
    }
}
