// Given an array of characters, return the length of the array with the characters and the count
// Only characters with count greater than 1

package String;

public class StringCompression {

  public int compress(char[] chars) {
    int n = chars.length;

    int idx = 0;
    int k = 0;

    while (idx < n) {
      char current = chars[idx];
      int count = 0;

      while (idx < n && chars[idx] == current) {
        idx++;
        count++;
      }

      chars[k] = current;
      k++;

      if (count > 1) {
        for (char c : Integer.toString(count).toCharArray()) {
          chars[k] = c;
          k++;
        }
      }

    }

    return k;
  }


}
