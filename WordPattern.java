// Time Complexity : O(n) 
// Space Complexity : O(n) -- not sure
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Approach:
// Very similar to approach to isomorphic strings. Replaced second string characters by words in the giver array.

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        if(pattern.length()!=s.length){
            return false;
        }
        HashMap<Character, String> h1 = new HashMap<Character, String>(26);
        HashMap<String, Character> h2 = new HashMap<String, Character>(26);
        for(int i = 0; i < pattern.length(); i++){
            if(!h1.containsKey(pattern.charAt(i))){
                h1.put(pattern.charAt(i), s[i]);
            }
            else if(!h1.get(pattern.charAt(i)).equals(s[i])){
                return false;
            }
        }
        
          for(int i = 0; i < pattern.length(); i++){
            if(!h2.containsKey(s[i])){
                h2.put(s[i], pattern.charAt(i));
            }
            else if(!h2.get(s[i]).equals(pattern.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
