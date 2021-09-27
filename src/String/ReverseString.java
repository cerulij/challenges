// Reverse a string in-place

package String;

import java.util.Arrays;

public class ReverseString {

  public void reverseString(char[] s) {
    int n = s.length;
    int j = n - 1;

    for (int i = 0; i < n / 2; i++) {
      char temp = s[j];
      s[n - 1 - i] = s[i];
      s[i] = temp;
      j--;
    }

    System.out.println(Arrays.toString(s));
  }


  public void reverseStringWhile(char[] s) {
    int left = 0;
    int right = s.length - 1;

    while (left < right) {
      char temp = s[left];
      s[left++] = s[right];
      s[right--] = temp;
    }
  }

}
