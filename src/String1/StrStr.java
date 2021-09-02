// Return index of the first occurrence of needle in a haystack

package String1;

public class StrStr {
  public int strStr(String haystack, String needle) {
    if (needle.isEmpty()) {
      return 0;
    }

    int m = haystack.length();
    int n = needle.length();

    if (m < n) {
      return -1;
    }

    for (int i = 0; i <= m - n; ++i) {
      int tempIndex = 0;
      int j = 0;
      if (haystack.charAt(i) == needle.charAt(j)) {
        tempIndex = i;
        while (j < n) {
          if (haystack.charAt(i+j) != needle.charAt(j)) {
            break;
          } else {
            j++;
          }
        }

      }

      if (j == n) {
        return tempIndex;
      }
    }

    return -1;
  }

  public static void main (String[] args) {
    String haystack = "abc";
    String needle = "c";

    System.out.println(new StrStr().strStr(haystack, needle));
  }

}
