// Count the number of 1 bits in an unsigned integer

package Other;

public class NumberOneBits {

  public int hammingWeight(int n) {
    int count = 0;

    for (int i = 0; i < 32; i++) {
      // if the last bit of n is 1, then count++
      if ((n & 1) == 1) {
        count++;
      }

      // shift n 1 bit to the right to keep checking the last bit
      n = n >> 1;
    }

    return count;
  }

}
