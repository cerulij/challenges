// Given a string that contains opening and closing brackets, determine if it is a valid expression

package Other1;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
  private HashMap<Character, Character> hm;

  public ValidParentheses() {
    this.hm = new HashMap<>();

    hm.put(')', '(');
    hm.put(']', '[');
    hm.put('}', '{');
  }

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      char pop = ' ';

      if (hm.containsKey(c)) {
        if (!stack.isEmpty()) {
          pop = stack.pop();
        }
        if (hm.get(c) != pop) {
          return false;
        }
      } else {
        stack.push(c);
      }
    }

    if (stack.isEmpty()) {
      return true;
    }
    return false;
  }

}
