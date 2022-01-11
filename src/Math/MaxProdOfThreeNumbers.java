// Given an integer array nums, find the three numbers whose product is maximum

package Math;

import java.util.Arrays;

public class MaxProdOfThreeNumbers {

  public int maximumProduct(int[] nums) {
    int n = nums.length;

    Arrays.sort(nums);

    int result = Math.max(nums[0] * nums[1] * nums[n-1], nums[n-3] * nums[n-2] * nums[n-1]);

    return result;
  }


}
