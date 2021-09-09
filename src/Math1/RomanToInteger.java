// Given a roman numeral, convert it to integer

package Math1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
  static Map<Character, Integer> values = new HashMap<>();

  static {
    values.put('M', 1000);
    values.put('D', 500);
    values.put('C', 100);
    values.put('L', 50);
    values.put('X', 10);
    values.put('V', 5);
    values.put('I', 1);
  }

  public int romanToInt(String s) {
    int sum = 0;
    int i = 0;

    while (i < s.length()) {
      Character currentSymbol = s.charAt(i);
      int currentValue = values.get(currentSymbol);
      int nextValue = 0;

      if (i + 1 < s.length()) {
        Character nextSymbol = s.charAt(i + 1);
        nextValue = values.get(nextSymbol);
      }

      if (currentValue < nextValue) {
        sum = sum + (nextValue - currentValue);
        i = i + 2;
      } else {
        sum = sum + currentValue;
        i = i + 1;
      }
    }

    return sum;
  }


  static Map<String, Integer> values2 = new HashMap<>();

  static {
    values2.put("M", 1000);
    values2.put("D", 500);
    values2.put("C", 100);
    values2.put("L", 50);
    values2.put("X", 10);
    values2.put("V", 5);
    values2.put("I", 1);
    values2.put("CM", 900);
    values2.put("CD", 400);
    values2.put("XC", 90);
    values2.put("XL", 40);
    values2.put("IX", 9);
    values2.put("IV", 4);
  }

  public int romanToIntAgain(String s) {
    int sum = 0;
    int i = 0;

    while (i < s.length()) {

      if (i < s.length() - 1) {
        String currentSymbol = s.substring(i, i+2);
        if (values2.containsKey(currentSymbol)) {
          sum += values2.get(currentSymbol);
          i += 2;
          continue;
        }
      }

      String currentSymbol = s.substring(i, i+1);
      sum += values2.get(currentSymbol);
      i += 1 ;
    }

    return sum;
  }

}
