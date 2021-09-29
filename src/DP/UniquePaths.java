// Given an m x n matrix, determine how many possible unique paths are from the top left corner
// to the bottom right corner
// Only moves allowed: down or right

package DP;

public class UniquePaths {

  public int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];

    int r, c;

    // fill first row with 1
    for (r = 0; r < m; r++) {
      dp[r][0] = 1;
    }

    // fill first col with 1
    for (c = 0; c < n; c++) {
      dp[0][c] = 1;
    }

    // or:
    // for (int[] arr : dp) {
    //   Arrays.fill(arr, 1);
    // }

    // iterate through all inner cells from (1, 1) to (m-1, n-1)
    for (r = 1; r < m; r++) {
      for (c = 1; c < n; c++) {
        // (r, c) = coming from the top + coming from the left
        dp[r][c] = dp[r - 1][c] + dp[r][c - 1];
      }
    }

    return dp[m - 1][n - 1];
  }


  public static void main (String[] args) {
    int m = 3;
    int n = 2;

    System.out.println(new UniquePaths().uniquePaths(m, n));

  }


}
