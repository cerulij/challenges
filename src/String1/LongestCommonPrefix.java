// Find the longest common prefix among an array of strings

package String1;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    int idx = 0;
    StringBuilder result = new StringBuilder();

    while (idx < strs[0].length()) {
      char c = strs[0].charAt(idx);
      char letter = ' ';

      for (int i = 0; i < strs.length; i++) {
        if (idx < strs[i].length()) {
          letter = strs[i].charAt(idx);
        } else {
          return result.toString();
        }

        if (c != letter) {
          return result.toString();
        }
      }

      result.append(c);
      idx++;
    }

    return result.toString();
  }

  public String longestCommonPrefixAgain(String[] strs) {

    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);

      for (int j = 1; j < strs.length; j++) {
        if (i == strs[j].length() || c != strs[j].charAt(i)) {
          return strs[0].substring(0, i);
        }
      }
    }

    return "";
  }

}
