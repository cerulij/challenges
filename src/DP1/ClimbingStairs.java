// You can either climb 1 or 2 steps. How many distinct ways can you climb to the top of the stairs?

package DP1;

public class ClimbingStairs {

  // DP (bottom-up)
  public int climbStairs(int n) {
    if (n == 1) {
      return 1;
    }

    int[] c = new int[n+1];
    c[1] = 1;
    c[2] = 2;

    for (int i = 3; i <= n; i++) {
      c[i] = c[i-1] + c[i-2];
    }

    return c[n];
  }

  // DP (memoization, top-down)
  public int climbStairsMemo(int n) {
    int[] memo = new int[n + 1];
    return climbStairsHelper(0, n, memo);
  }

  public int climbStairsHelper(int i, int n, int[] memo) {
    if (i > n) {
      return 0;
    }

    if (i == n) {
      return 1;
    }

    if (memo[i] > 0) {
      return memo[i];
    }

    memo[i] = climbStairsHelper(i + 1, n, memo) + climbStairsHelper(i + 2, n, memo);
    return memo[i];
  }

  public static void main (String[] args) {
    System.out.println(new ClimbingStairs().climbStairsMemo(3));
  }

}
