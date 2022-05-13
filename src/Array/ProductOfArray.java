// Given an array, return another array such that every number is equal to the product of all
// the elements of the original array except the number itself

package Array;

public class ProductOfArray {

  public int[] productExceptSelf(int[] nums) {
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    int[] result = new int[nums.length];

    // to the left of element at index 0: 1
    left[0] = 1;

    // to the right of element at last index: 1
    right[nums.length - 1] = 1;

    for (int i = 1; i < nums.length; i++) {
      // left of i already contains product of elements to the left of i - 1
      // multiplying by i - 1 (num not self) is enough
      left[i] = left[i - 1] * nums[i - 1];
    }

    for (int i = nums.length - 2; i >= 0; i--) {
      // right of i already contains product of elements to the right of i + 1
      // multiplying by i + 1 (num not self) is enough
      right[i] = right[i + 1] * nums[i + 1];
    }

    // final result: multiply left by right
    for (int i = 0; i < nums.length; i++) {
      result[i] = left[i] * right[i];
    }

    return result;
  }

}
