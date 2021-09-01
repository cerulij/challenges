package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection {

  public int[] intersect(int[] nums1, int[] nums2) {
    if (nums2.length > nums1.length) {
      return intersect(nums2, nums1);
    }

    ArrayList<Integer> temp = new ArrayList<>();
    HashMap<Integer, Integer> hash = new HashMap<>();

    for (int num : nums1) {
      hash.put(num, hash.getOrDefault(num, 0) + 1);
    }

    for (int i : nums2) {
      if (hash.containsKey(i)) {
        int count = hash.get(i);

        if (count > 0) {
          hash.put(i, --count);
          temp.add(i);
        }
      }
    }

    int[] result = new int[temp.size()];

    for (int j = 0; j < temp.size(); j++) {
      result[j] = temp.get(j);
    }

    return result;
  }

}
