// Reverse bits of a given 32-bit unsigned integer

package Binary;

public class ReverseBits {

  public int reverseBits(int n) {
    // this int stores the reversed number
    int reversed = 0;

    // iterate through every bit of an unsigned integer
    for (int i = 0; i < 32; i++) {
      // in the first iteration, binary reversed is 0000 ... 0000
      // we start by shifting reversed one bit to the left
      reversed <<= 1; // reversed = reversed << 1;

      // if the final bit of n is 1, then the bit in reversed is 0
      if ((n & 1) == 1) {
        // this is the xor
        reversed ^= 1;
//        reversed = reversed ^ 1;
      }

      // shift entire n one bit to the right
      n = n >> 1;
    }

    return reversed;
  }

}
