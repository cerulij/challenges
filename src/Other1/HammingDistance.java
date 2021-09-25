// Given two integers x and y, return the hamming distance (the positions where the bits are different)

package Other1;

public class HammingDistance {

  public int hammingDistance(int x, int y) {
    int xor = x ^ y;
    int count = 0;

    while (xor != 0) {
      // if the last digit is a 1 (not a 0)
      // if (xor & 1 == 1) {
      if (xor % 2 == 1) {
        count++;
      }

      // shift all the xor to the right so we can check the last digit every time
      // xor =>> 1;
      xor = xor >> 1;
    }

    return count;
  }


}
