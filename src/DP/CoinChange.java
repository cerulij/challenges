// Given an integer array coins and an integer amount, return the fewest number of coins
// to make up that amount

package DP;

import java.util.Arrays;

public class CoinChange {

  public int coinChange(int[] coins, int amount) {
    int[] c = new int[amount + 1];

    // fill the array with dummy value amount + 1
    Arrays.fill(c, amount + 1);

    // 0 change for 0 cents
    c[0] = 0;

    for (int i = 1; i <= amount; i++) {

      for (int j = 0; j < coins.length; j++) {
        if (coins[j] <= i) {
          // when I get to a particular i amount
          // I fill the table with coins I need for that amount MINUS the current coin PLUS 1
          // (which is the current coin)
          // the min decides between that and the dummy value amount + 1
          // (meaning there is no change for that i amount)
          c[i] = Math.min(c[i], c[i - coins[j]] + 1);
        }
      }
    }

    if (c[amount] > amount) {
      return -1;
    }
    return c[amount];
  }


  public static void main (String[] args) {
    int[] coins = {1, 2, 5};
    int amount = 11;

    System.out.println(new CoinChange().coinChange(coins, amount));


  }
}
