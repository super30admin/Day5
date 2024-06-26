// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
class Solution {
  public boolean wordPattern(String pattern, String s) {
    // Checking if both lengths are the same.
    String[] str = s.split(" ");
    if(str.length != pattern.length()) return false;

    Map<Character, String> hashmap = new HashMap<>();
    Set<String> set = new HashSet<>();

    for(int i = 0; i<str.length; i++) {
      char currentChar = pattern.charAt(i);
      String currentString = str[i];

      // Checking if the hashmap contains the key or not.
      if(hashmap.containsKey(currentChar)) {
        // If it contains the key, does it match the existing key-value pair.
        if(!hashmap.get(currentChar).equals(currentString)){
          return false;
        }
      }else {
        // Checking if the value already exists in the set.
        if(set.contains(currentString)) {
          return false;
        }
        // If none of the above, add key-value pair to hashmap and value to set.
        hashmap.put(currentChar, currentString);
        set.add(currentString);
      }
    }
    return true;
  }
}

