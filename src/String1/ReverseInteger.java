// Reverse a 32-bit integer. Assume environment does not allow 64-bit integers

package String1;

public class ReverseInteger {

  public int reverse(int x) {
    int result = 0;

    while (x != 0) {
      int pop = x % 10;
      x = x / 10;

      // Integer.MAX_VALUE = 2147483647
      // max / 10 = 214748364
      // If result > max / 10, when adding pop it will overflow
      // If result = max / 10, pop must be greater than 7 to overflow
      if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
        return 0;
      }

      // Integer.MIN_VALUE = -2147483648
      // min / 10 = -214748364
      // If result < min / 10, when adding pop it will overflow
      // If result - min / 10, pop must be less than -8
      if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
        return 0;
      }

      result = result * 10 + pop;
    }

    return result;
  }


  public static void main (String[] args) {
    // just to reverse without 32-bit constraint
    int x = 123;
    int result = 0;

    while (x != 0) {
      int pop = x % 10;
      x = x / 10;

      result = result * 10 + pop;
    }

    System.out.println(result);
  }

}
