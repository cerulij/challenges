package Array;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class SingleNumber {
  public int singleNumber(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    Hashtable<Integer, Integer> hash = new Hashtable<>();
    int single = 0;

    for (int num : nums) {
      Integer count = hash.get(num);

      if (count == null) {
        hash.put(num, 1);
      } else {
        hash.put(num, ++count);
      }
    }

    for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
      if (entry.getValue() == 1) {
        single = entry.getKey();
      }
    }

    return single;
  }

  public int singleNumberAgain(int[] nums) {
    HashMap<Integer, Integer> hash = new HashMap<>();

    for (int i : nums) {
      hash.put(i, hash.getOrDefault(i, 0) + 1);
    }

    for (int i : nums) {
      if (hash.get(i) == 1) {
        return i;
      }
    }

    return 0;
  }



  public static void main (String[] args) {
    int[] nums = {4,1,2,1,2};

    System.out.println(new SingleNumber().singleNumber(nums));

    System.out.println(new SingleNumber().singleNumberAgain(nums));

  }

}
