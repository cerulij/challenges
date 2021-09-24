// Given an array of distinct integers, return the only number in the range missing from the array

package Other1;

import java.util.HashSet;

public class MissingNumber {

  public int missingNumber(int[] nums) {

    HashSet<Integer> set = new HashSet<>();

    for (int num : nums) {
      set.add(num);
    }

    int last = nums.length + 1;

    for (int i = 0; i < last; i++) {
      if (!set.contains(i)) {
        return i;
      }
    }

    return -1;
  }

}
