// Rotate array by k steps

package Array1;

import java.util.Arrays;

public class RotateArray {

  public void rotate(int[] nums, int k) {
    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      result[(i+k) % nums.length] = nums[i];
    }

    for (int j = 0; j < nums.length; j++) {
      nums[j] = result[j];
    }

    System.out.println(Arrays.toString(nums));
  }

}
