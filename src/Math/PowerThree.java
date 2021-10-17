// Determine if a number is a power of three

package Math;

public class PowerThree {

  public boolean isPowerOfThree(int n) {
    if (n <= 0) {
      return false;
    }

    if (n % 3 == 0) {
      n = n / 3;
      return isPowerOfThree(n);
    }

    if (n == 1) {
      return true;
    }

    return false;
  }

  public boolean isPowerOfThree2(int n) {
    if (n < 1) {
      return false;
    }

    while (n % 3 == 0) {
      n = n / 3;
    }

    return n == 1;
  }

  public static void main (String[] args) {
    System.out.println(new PowerThree().isPowerOfThree(9));

  }


}
