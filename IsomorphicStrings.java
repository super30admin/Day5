
/**
 * Time Complexity: O(n + k) where n is the length of string s and k is the length of string t
 * Space Complexity: O(n + k ) where n is the length of string s and k is the length of string t
 * 
 * Approach: We use a hashmap to create mapping of every character in s to every character in t.
 * If at any point, the current char from one string is not matching to other string, we return false.
 * We also check if character is not in one string and part of other string. If that is the case, we return false.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

  public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length() || (s == null || s.length() == 0)) {
      return false;
    }

    Map<Character, Character> sMap = new HashMap<>();
    // Map<Character, Character> tMap = new HashMap<>();
    Set<Character> set = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);
      if (sMap.containsKey(sChar)) {
        if (sMap.get(sChar) != tChar) {
          return false;
        }
      } else {
        sMap.put(sChar, tChar);
        if (set.contains(tChar)) {
          return false;
        }
        set.add(tChar);
      }
    }
    return true;
  }
}
