// Given two arrays, return an array of their intersection

package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection {

  public int[] intersect(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) {
      return intersect(nums2, nums1);
    }

    ArrayList<Integer> temp = new ArrayList<>();
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int num : nums1) {
      hm.put(num, hm.getOrDefault(num, 0) + 1);
    }

    for (int i : nums2) {
      if (hm.containsKey(i)) {
        int count = hm.get(i);

        if (count > 0) {
          hm.put(i, --count);
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
