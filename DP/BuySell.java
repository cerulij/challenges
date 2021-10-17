// Best time to buy and sell a stock to achieve the maximum profit
// You can buy and sell only once

package DP;

public class BuySell {
  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }

      if (prices[i] - minPrice > maxProfit) {
        maxProfit = prices[i] - minPrice;
      }

    }

    return maxProfit;
  }

}
