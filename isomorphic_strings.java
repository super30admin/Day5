/******************** Isomorphic Strings ****************************/
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {

  public boolean isIsomorphic(String s, String t) {
    HashMap<Character, Character> map = new HashMap<>();
    //The length of both the strings have to be equal for the condition to be valid
    if (s.length() != t.length()) return false;
    for (int i = 0; i < s.length(); i++) {
      if (map.containsKey(s.charAt(i))) { //if the key is present, we check if it is mapped to the corresponding element in string t
        if (map.get(s.charAt(i)) != t.charAt(i)) {
          return false;
        }
      }
      //if the key is not present but the value is present, then it indicates it is mapped to a different character and that breaks the condition
      else if (map.containsValue(t.charAt(i))) {
        return false;
      }
      //map corresponding character of string s with string t
      else {
        map.put(s.charAt(i), t.charAt(i));
      }
    }
    return true;
  }
}
//e a
//g d
