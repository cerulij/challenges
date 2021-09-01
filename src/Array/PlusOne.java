package Array;

import java.util.LinkedList;

public class PlusOne {

  public int[] plusOneMine(int[] digits) {

    long result = 0;

    int z = 0;
    for (int i = digits.length - 1; i >= 0; i--) {
      result += digits[i] * (Math.pow(10, z));
      System.out.println(result);
      z++;
    }

    result += 1;

    LinkedList<Integer> stack = new LinkedList<>();

    int x = 0;
    while (result > 0) {
      long t = result % 10;
      stack.push( (int) t);
      result = result / 10;
      x++;
    }

    int j = 0;
    digits = new int[x];
    while (!stack.isEmpty()) {
      digits[j] = stack.pop();
      j++;
    }

    return digits;
  }

  public int[] plusOne(int[] digits) {
    int n = digits.length;

    for (int i = n - 1; i >= 0; i--) {
      if (digits[i] == 9) {
        digits[i] = 0;
      } else {
        digits[i] += digits[i] + 1;
        return digits;
      }
    }

    digits = new int[n + 1];
    digits[0] = 1;

    return digits;
  }


  public static void main (String[] args) {
    int[] nums = {9,9,9};

    new PlusOne().plusOne(nums);

  }



}
