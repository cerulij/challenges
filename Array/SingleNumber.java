// Find the element that appears only once

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

    for (int n : nums) {
      hash.put(n, hash.getOrDefault(n, 0) + 1);
    }

    for (int n : nums) {
      if (hash.get(n) == 1) {
        return n;
      }
    }

    return 0;
  }

}
