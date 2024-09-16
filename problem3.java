// TC : O(n)
// SC: O(n)

// Leetcode Run : yes
// leetcode URL : https://leetcode.com/problems/word-pattern/


class Solution {
  public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");

    if(words.length != pattern.length())
      return false;


    HashMap<Character, String> map = new HashMap<Character, String>();

    for(int i=0; i<pattern.length(); i++) {
      if(map.containsValue(words[i])) {
        if(!map.containsKey(pattern.charAt(i)))
          return false;
      }


      if(!map.containsKey(pattern.charAt(i)))
        map.put(pattern.charAt(i), words[i]);
    }

    for(int i=0; i<pattern.length(); i++) {
      if(!words[i].equals(map.get(pattern.charAt(i)))) {
        return false;
      }
    }

    return true;

  }
}