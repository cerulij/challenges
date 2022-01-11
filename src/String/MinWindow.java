package String;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {


  public String minWindow(String s, String t) {

    if (s.length() == 0 || t.length() == 0) {
      return "";
    }

    Map<Character, Integer> hmT = new HashMap<>();

    for (int i = 0; i < t.length(); i++) {
      int count = hmT.getOrDefault(t.charAt(i), 0);
      hmT.put(t.charAt(i), count + 1);
    }

    int lengthRequired = hmT.size();
    int lengthWindow = 0;

    Map<Character, Integer> window = new HashMap<>();

    int left = 0;
    int right = 0;

    int[] result = {-1, 0, 0};

    while (right < s.length()) {
      char c = s.charAt(right);
      int count = window.getOrDefault(c, 0);
      window.put(c, count + 1);

      if (hmT.containsKey(c) && window.get(c).equals(hmT.get(c))) {
        lengthWindow++;
      }

      while (left <= right && lengthRequired == lengthWindow) {
        char l = s.charAt(left);

        if (result[0] == -1 || result[0] > right - left + 1) {
          result[0] = right - left + 1;
          result[1] = left;
          result[2] = right;
        }

        window.put(l, window.get(l) - 1);
        if (hmT.containsKey(l) && window.get(l) < hmT.get(l)) {
          lengthWindow--;
        }
        left++;
      }

      right++;
    }

    return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
  }


}
