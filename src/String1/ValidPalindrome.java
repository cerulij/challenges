package String1;

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

    for (int left = 0; left < s.length(); left++) {
      while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      }

      while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      }

      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }

      right--;
    }

    return true;
  }

}
