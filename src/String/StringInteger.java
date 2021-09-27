// String to integer with multiple edge cases

package String;

public class StringInteger {

  public int myAtoi(String s) {
    long result = 0;

    if (s.length() == 0) {
      return 0;
    }

    int i = 0;
    while (i < s.length() && s.charAt(i) == ' ') {
      i++;
    }

    if (Character.isAlphabetic(s.charAt(i))) {
      return 0;
    }

    int sign = 1;
    if (s.charAt(i) == '-') {
      sign = -1;
      i++;
    } else if (s.charAt(i) == '+') {
      i++;
    }

    while (i < s.length() && Character.isDigit(s.charAt(i))) {
      int value = Character.getNumericValue(s.charAt(i));

      if (sign * result * 10 + value >= Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }

      if (sign * result * 10 + value <= Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }

      result = result * 10 + value;
      i++;
    }


    if (sign == -1) {
      result = -result;
    }


    return (int) result;
  }

}
