// Given two strings, return true if the second one is an anagram

package String1;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    HashMap<Character, Integer> hm1 = new HashMap<>();
    HashMap<Character, Integer> hm2 = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char a = s.charAt(i);
      char b = t.charAt(i);

      hm1.put(a, hm1.getOrDefault(a, 0) + 1);
      hm2.put(b, hm2.getOrDefault(b, 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
      if (hm2.containsKey(entry.getKey())) {
        if (!hm2.get(entry.getKey()).equals(entry.getValue())) {
          return false;
        }
      } else {
        return false;
      }
    }

    return true;
  }

  public static void main (String[] args) {
    String s = "";
    String t = "";

    System.out.println(new ValidAnagram().isAnagram(s, t));

  }



}
