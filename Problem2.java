// Time Complexity: O(n)
// Space Complexity: O(n) 

// Approach: Create two maps for mapping S to T and vice-versa.
// If s[i] exists in mapS and if the value is not equal to t[i], return false
// If s[i] doesn't exist in mapS, we can add it to mapS. 
// Before adding it to mapT, we can check if the mapping already exists in mapT,
//  if it exists, return false.
// Return true if the loop terminates.

//Leetcode: 205, Isomorphic Strings

import java.util.*;

public class Problem2 {
  public boolean isIsomorphic(String s, String t) {
    if (s == null && t == null) {
      return true;
    }

    if (s.length() != t.length()) {
      return false;
    }

    HashMap<Character, Character> mapS = new HashMap<>();
    HashMap<Character, Character> mapT = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char s1 = s.charAt(i);
      char t1 = t.charAt(i);

      if (mapS.containsKey(s1)) {
        if (mapS.get(s1) != t1) {
          return false;
        }
      } else {
        mapS.put(s1, t1);
        if (mapT.containsKey(t1)) {
          return false;
        }
        mapT.put(t1, s1);
      }
    }

    return true;
  }
}
