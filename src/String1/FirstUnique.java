// Find the first non-repeating character

package String1;

import java.util.HashMap;

public class FirstUnique {

  public int firstUniqChar(String s) {
    String[] a = s.split("");

    HashMap<String, Integer> hm = new HashMap<>();

    for (String letter : a) {
      hm.put(letter, hm.getOrDefault(letter, 0) + 1);
    }

    for (int i = 0; i < a.length; i++) {
      if (hm.containsKey(a[i]) && hm.get(a[i]) == 1) {
        return i;
      }
    }

    return -1;
  }

}