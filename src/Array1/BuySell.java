// Best time to but and sell a stock

package Array1;

public class BuySell {

  public int maxProfit(int[] prices) {
    int i = 0;
    int maxProfit = 0;
    int peak = prices[0];
    int valley = prices[0];

    while (i < prices.length - 1) {

      while (i < prices.length - 1 && prices[i] >= prices[i+1]) {
        i++;
      }
      valley = prices[i];

      while (i < prices.length - 1 && prices[i] <= prices[i+1]) {
        i++;
      }
      peak = prices[i];

      maxProfit += peak - valley;

    }

    return maxProfit;
  }

}