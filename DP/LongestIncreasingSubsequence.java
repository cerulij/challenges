// Given an integer array, return the length of the longest increasing subsequence

package DP;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

  public int lengthOfLIS(int[] nums) {
    int[] c = new int[nums.length];

    // fill array with 1 since every integer in nums is a subsequence of size 1
    Arrays.fill(c, 1);

    // iterate from nums[1]
    for (int i = 1; i < nums.length; i++) {
      // check every num before nums[i]
      for (int j = 0; j < i; j++) {
        // if the num is less than the current nums[i], it means we have an increasing subsequence
        if (nums[j] < nums[i]) {
          // c[i] decides between keeping the current max or adding one
          c[i] = Math.max(c[i], c[j] + 1);
        }
      }
    }

    // we must return the max value of c because c[nums.length] might not be the max
    int max = 0;
    for (int m : c) {
      max = Math.max(max, m);
    }

    return max;
  }




  public static void main(String[] args) {
    int[] nums = {10, 9, 2, 5, 3, 7};

    System.out.println(new LongestIncreasingSubsequence().lengthOfLIS(nums));

  }

}
