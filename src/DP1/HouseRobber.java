// Find the max sum of numbers such that no two numbers are adjacent

package DP1;

public class HouseRobber {
  public int rob(int[] nums) {
    int n = nums.length;
    int[] c = new int[n];

    c[0] = nums[0];
    if (n > 1) {
      c[1] = Math.max(nums[1], c[0]);
    }

    for (int i = 2; i < n; i++) {
      // this way, we guarantee no two numbers are adjacent
      c[i] = Math.max(c[i-1], c[i-2] + nums[i]);
    }

    return c[n-1];
  }

}
