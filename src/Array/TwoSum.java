package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.SupportedSourceVersion;

public class TwoSum {

  int binarySearch(int arr[], int x) {
    int l = 0;
    int r = arr.length - 1;

    while (l <= r) {
      int m = l + (r - l) / 2;

      if (arr[m] == x)
        return m;

      if (arr[m] < x) {
        l = m + 1;
      } else {
        r = m - 1;
      }
    }

    return -1;
  }

  public int[] twoSumMine(int[] nums, int target) {

    int[] result = new int[2];
    int[] a = nums.clone();
    Arrays.sort(a);

    int m = 0;
    int i;

    for (i = 0; i < nums.length; i++) {
      int value = target - nums[i];
      if (value != nums[i]) {
        m = binarySearch(a, value);
        if (m != -1) {
          break;
        }
      }
    }

    System.out.println(nums[i]);
    System.out.println(a[m]);

    int j;
    for (j = 0; j < nums.length; j++) {
      if (nums[j] == a[m]) {
        break;
      }
    }

    if (i < j) {
      result[0] = i;
      result[1] = j;
    } else {
      result[0] = j;
      result[1] = i;
    }

    System.out.println(Arrays.toString(result));
    return result;
  }

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
