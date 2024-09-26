// Time Complexity: O(n KlogK) where n is the length of strs and
// kLogK is the complexity for sorting every string in strs
// Space Complexity: O(n) 

// Approach: Iterate over the strs string array. For every str in strs,
// I sort the str and then check if such a key exists in my hashmap,
// if it doesn't exist, I add my sorted string as key and add my str 
// in a list and add this list as the value.
// If it already exists, I just add my str to the list in value.  

//Leetcode: 49, Group Anagrams

import java.util.*;

public class Problem1 {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();

    if (strs.length == 0) {
      return result;
    }

    if (strs.length == 1) {
      List<String> tmp = new ArrayList<>();
      tmp.add(strs[0]);
      result.add(tmp);
      return result;
    }

    HashMap<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      char[] ch = str.toCharArray();
      Arrays.sort(ch);

      String tmp = String.valueOf(ch);
      List<String> list = new ArrayList<>();

      if (map.containsKey(tmp)) {
        list = map.get(tmp);
      }

      list.add(str);
      map.put(tmp, list);
    }

    for (String s : map.keySet()) {
      result.add(map.get(s));
    }

    return result;
  }
}