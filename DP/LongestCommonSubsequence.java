// Given two strings, return the length of their longest common subsequence

package DP;

public class LongestCommonSubsequence {

  public int longestCommonSubsequence(String text1, String text2) {
    int n = text1.length();
    int m = text2.length();

    // dp is filled with zeroes
    // we need the first row and column to be "empty" for the bottom-up approach to work
    // that is why we need 1 more than the size of the two texts
    int[][] dp = new int[n + 1][m + 1];

    // we fill dp[r][c] each column at a time from left to right and then down
    // remember: the first row and first column are filled with zeroes
    for (int r = 1; r <= n; r++) {
      for (int c = 1; c <= m; c++) {
        if (text1.charAt(r - 1) == text2.charAt(c - 1)) {
          dp[r][c] = 1 + dp[r - 1][c - 1];
        } else {
          dp[r][c] = Math.max(dp[r - 1][c], dp[r][c - 1]);
        }

      }
    }

    return dp[n][m];
  }


  public static void main (String[] args) {
    String text1 = "abc";
    String text2 = "def";

    System.out.println(new LongestCommonSubsequence().longestCommonSubsequence(text1, text2));
  }

}
