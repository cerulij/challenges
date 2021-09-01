// Find if any value appears at least twice

package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {

  public boolean containsDuplicate(int[] nums) {
    if (nums.length <= 1) {
      return false;
    }

    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i+1]) {
        return true;
      }
    }

    return false;
  }


  public boolean containsDuplicateHash(int[] nums) {
    Set<Integer> a = new HashSet<>();

    for (int x : nums) {
      if (a.contains(x)) {
        return true;
      }
      a.add(x);
    }

    return false;
  }

}
