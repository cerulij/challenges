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

  public static void main (String[] args) {
    char[] s = {'h'};
    char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};

    new ReverseString().reverseString(s);
  }

}
