// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> h1 = new HashMap<Character, Character>();
        HashMap<Character, Character> h2 = new HashMap<Character, Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char sCharacter = s.charAt(i);
            char tCharacter = t.charAt(i);
            
            // checking if the key is already present
            if(h1.containsKey(sCharacter)) {
                // if the value in hashmap is not matching with the current value then return false
                if(h1.get(sCharacter) != tCharacter)
                    return false;
            }
            else
                // if not present add key value pair to hashmap
                h1.put(sCharacter, tCharacter);
            
            // checking if the key is already present
            if(h2.containsKey(tCharacter)) {
                // if the value in hashmap is not matching with the current value then return false
                if(h2.get(tCharacter) != sCharacter)
                    return false;
            }
            else
                // if not present add key value pair to hashmap
                h2.put(tCharacter, sCharacter);
        }
        return true;
        
    }
}