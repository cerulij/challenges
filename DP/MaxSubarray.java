// Find the contiguous subarray of an array of ints that has the largest sum

package DP;

public class MaxSubarray {

  public int maxSubArray(int[] nums) {
    int current = nums[0];
    int max = nums[0];

    for (int i = 1; i < nums.length; i++) {
      // update current if the new num is greater than the sum so far
      current = Math.max(nums[i], current + nums[i]);

      // update max only if it is less than current
      max = Math.max(current, max);
    }

    // max contains the sum of the largest subarray, might not be equal to current
    return max;
  }

}
