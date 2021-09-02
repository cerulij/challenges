// String to integer with multiple edge cases

package String1;

public class StringInteger {
  public int myAtoi(String s) {
    if (s.length() == 0) {
      return 0;
    }

    int i = 0;
    while (s.charAt(i) == ' ') {
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

    long result = 0;
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
      int value = Character.getNumericValue(s.charAt(i));
      result = result * 10 + value;
      i++;
    }

    if (sign == -1) {
      result = -result;
    }

    if (result > Integer.MAX_VALUE) {
      result = Integer.MAX_VALUE;
    }

    if (result < Integer.MIN_VALUE) {
      result = Integer.MIN_VALUE;
    }

    return (int) result;
  }


  public static void main (String[] args) {
    String s = "     ";

    System.out.println(new StringInteger().myAtoi(s));

  }



}
