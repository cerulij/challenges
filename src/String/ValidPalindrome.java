// Determine if a string is a palindrome considering only alphanumeric characters ignoring cases

package String;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    String res = "";

    for (int i = 0; i < s.length(); i++) {
      char a = s.charAt(i);

      if (Character.isAlphabetic(a) || Character.isDigit(a)) {
        res += String.valueOf(a).toLowerCase();
      }
    }

    int left = 0;
    int right = res.length() - 1;

    while (left < right) {
      if (res.charAt(right) != res.charAt(left)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }

  public boolean isPalindromeAgain(String s) {
    int right = s.length() - 1;
    int left = 0;

    while (left < right) {
      if (!Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      }

      if (!Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      }

      if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }

}
