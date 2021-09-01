package Array;

import java.util.HashMap;
import java.util.Map;


public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];

    Map<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      hm.put(nums[i], i);
    }

    for (int j = 0; j < nums.length; j++) {
      int value = target - nums[j];

      if (hm.containsKey(value) && hm.get(value) != j) {
        if (j < hm.get(value)) {
          result[0] = j;
          result[1] = hm.get(value);
        } else {
          result[0] = hm.get(value);
          result[1] = j;
        }
      }
    }

    return result;
  }


  public static void main (String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;

    new TwoSum().twoSum(nums, target);
  }

}
