// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
class Solution {
  public boolean isIsomorphic(String s, String t) {
    if(s.length()!=t.length()) return false;
    // Approach is to use 1 hashmap and 1 hashset
    Map<Character, Character> hashmap = new HashMap<>();
    Set<Character> set = new HashSet<>();
    for(int i = 0; i<s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);
      // Check if hashmap contains key or not.
      if(hashmap.containsKey(sChar)) {
        if(hashmap.get(sChar)!=tChar) {
          return false;
        }
      }else {
        hashmap.put(sChar, tChar);
        // Check if set contains value
        if(set.contains(tChar)) {
          return false;
        }
        set.add(tChar);
      }
    }
    return true;
  }
}