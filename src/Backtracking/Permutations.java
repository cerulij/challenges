// Given an array of distinct integers, find all possible permutations

package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
  public void backtrack(List<Integer> nums, List<List<Integer>> output, int index) {
    // one permutation is done
    if (index == nums.size())
      output.add(new ArrayList<>(nums));

    for (int i = index; i < nums.size(); i++) {
      // do the permutation
      Collections.swap(nums, index, i);

      // go to the next integer
      backtrack(nums, output, index + 1);

      // swap back to restore order
      Collections.swap(nums, i, index);
    }
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> output = new ArrayList<>();

    List<Integer> nums_lst = new ArrayList<>();

    for (int num : nums) {
      nums_lst.add(num);
    }

    backtrack(nums_lst, output, 0);

    return output;
  }


  public static void main(String[] args) {
    int[] nums = {1, 2};
    new Permutations().permute(nums);
  }

}
