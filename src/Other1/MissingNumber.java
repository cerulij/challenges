// Given an array of distinct integers, return the only number in the range missing from the array

package Other1;

import java.util.Arrays;

public class MissingNumber {

  public int missingNumber(int[] nums) {

    Arrays.sort(nums);

    if (nums[0] != 0) {
      return 0;
    }

    else if (nums[nums.length - 1] != nums.length) {
      return nums.length;
    }

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != i) {
        return i;
      }
    }

    return -1;
  }

}
