// Given an integer array nums where each element represents the max jump length,
// return true if you can reach the last index
// SOLVED using a greedy approach

package DP;

public class JumpGame {

  public boolean canJump(int[] nums) {

    // stores the last position
    int lastIndex = nums.length - 1;
    // stores the max jump we can make
    int maxJump = 0;

    // we go from 0 to the max jump we can make at every index
    for (int i = 0; i <= maxJump; i++) {
      maxJump = Math.max(maxJump, i + nums[i]);
      // if the max jump is greater than or equal to the last index, we can reach
      if (maxJump >= lastIndex) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[] nums = {2, 3, 1, 1, 4};
    int[] nums2 = {3, 2, 1, 0, 4};

    System.out.println(new JumpGame().canJump(nums2));

  }

}
