/******************** Pattern Match ****************************/
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {

  public boolean wordPattern(String pattern, String s) {
    //checking for the base case- if either of the length is 0, we can't check the conditions
    if (pattern.length() == 0 || s.length() == 0) return false;
    //split the s string into a string array
    String[] word = s.split(" ");
    if (pattern.length() != word.length) return false; //length has to be same to be compared
    HashMap<Character, String> map = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {
      if (map.containsKey(pattern.charAt(i))) { //if the key is present, we check if it is mapped to the corresponding element in word array
        if (!map.get(pattern.charAt(i)).equals(word[i])) {
          return false;
        }
      } else if (map.containsValue(word[i])) { //if the key is not present but the value is present, then it indicates it is mapped to a different character and that breaks the condition
        return false;
      } else {
        map.put(pattern.charAt(i), word[i]); //map the corresponding character in pattern with a string in word
      }
    }
    return true;
  }
}
