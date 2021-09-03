// Given an array of integer, move zeroes to the end in-place

package Array1;

public class MoveZeroes {

  public void moveZeroes(int[] nums) {
    int j = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[j] = nums[i];
        j++;
      }
    }

    while (j < nums.length) {
      nums[j] = 0;
      j++;
    }
  }

}
