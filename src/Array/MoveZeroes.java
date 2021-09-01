package Array;

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


  public static void main (String[] args) {
    int[] nums = {0};

    new MoveZeroes().moveZeroes(nums);
  }
}
