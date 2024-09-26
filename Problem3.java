// Time Complexity: O(n)
// Space Complexity: O(n) 

// Approach: Create two maps, map1 and map2.
// If map1 contains ith char as key, we check if value is equal to the
// ith index of words array. If this condition fails, return false.
// If map1 doesn't contain ith char as key, we add it. 
// We check then if map2 contains words[i], if it does, return false,
// else add it words and pattern to map2.

//Leetcode: 290, Word Pattern

import java.util.*;

public class Problem3 {
  public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");

    if (pattern.length() != words.length) {
      return false;
    }

    HashMap<Character, String> map1 = new HashMap<>();
    HashMap<String, Character> map2 = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {
      char ch = pattern.charAt(i);

      if (map1.containsKey(ch)) {
        if (!map1.get(ch).equals(words[i])) {
          return false;
        }
      } else {
        map1.put(ch, words[i]);
        if (map2.containsKey(words[i])) {
          return false;
        }
        map2.put(words[i], ch);
      }
    }

    return true;
  }
}