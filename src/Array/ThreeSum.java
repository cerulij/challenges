// Given an integer array nums, return all triplets such that i != j, i != k, j != k and
// arr[i] + arr[j] + arr[k] = 0

package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> res = new ArrayList<>();

    // condition nums[i] <= 0 is because if nums[i] is positive after that we won't find a sum = 0
    for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
      // if it is the first index or nums[i] != nums[i - 1]
      if (i == 0 || nums[i] != nums[i - 1]) {
        helper(i, nums, res);
      }
    }

    return res;
  }

  public void helper(int i, int[] nums, List<List<Integer>> res) {
    // left and right represent the subarray to the right of i
    int left = i + 1;
    int right = nums.length - 1;

    while (left < right) {
      int sum = nums[i] + nums[left] + nums[right];

      // if the sum is negative, move the left pointer
      if (sum < 0) {
        left++;
      }

      // if the sum is positive, move the right pointer
      else if (sum > 0) {
        right--;
      }

      // if the sum is 0, add the triplet to the array list and move the pointers
      else {
        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
        left++;
        right--;

        // if, after moving left, it is equal to the index before, keep moving it
        while (left < right && nums[left] != nums[left - 1]) {
          left++;
        }
      }
    }

  }




}
