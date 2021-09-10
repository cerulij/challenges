// Count the number of 1 bits in an unsigned integer

package Other1;

public class NumberOneBits {

  public int hammingWeight(int n) {
    int mask = 1;
    int count = 0;

    for (int i = 0; i < 32; i++) {
      if ((n & mask) != 0) {
        count++;
      }

      // shift the mask to the left by 1 position
      mask <<= 1;
    }

    return count;
  }

}
