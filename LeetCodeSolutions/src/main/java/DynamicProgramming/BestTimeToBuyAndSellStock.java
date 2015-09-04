package DynamicProgramming;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {
    /* Runtime: 380 ms - 30% */
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE, bestProfile = 0;
        for (int i = 0; i < prices.length; ++i) {
            bestProfile = Math.max(prices[i] - minValue, bestProfile);
            minValue = Math.min(minValue, prices[i]);
        }
        return bestProfile;
    }
}
