// Time complexity: O(N) where N is the size of the pattern
// Space complexity: O(N) (array created after space indented string split is auxilliary space) cMap (char -> string) may be of max size 26, 
// but sMap (string -> char) can extend to size more than 26. We return false in that case immediately, so that is considered constant.
// Submission on leetcode successful: Yes

/*
Algorithm:
=========
1. This is similar to isomorphic strings, where we use 2 maps to check if a->b and b->a always match
2. If a character matches to different string or vice-versa, pattern fails and return false
3. If pattern matches, return true
*/

class Solution {
    
    // Maps to check the word pattern
    Map<Character, String> cMap = new HashMap<>();
    Map<String, Character> sMap = new HashMap<>();
    
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || str == null) return false;
        
        //Space indented string split to array
        String[] words = str.split(" ");
        
        //Pattern fails if unequal lengths
        if(pattern.length() != words.length ) return false;
        

        // Create mappings and check if pattern continues
        for(int i = 0; i < pattern.length(); i++) { 
            char c = pattern.charAt(i);
            String s = words[i];
            
            if(!cMap.containsKey(c)) {
                cMap.put(c, s);
            }
            else {
                // character already mapped to some other string
                if(!cMap.get(c).equals(s)) return false;
            }
            
             if(!sMap.containsKey(s)) {
                sMap.put(s, c);
            }
            else {
                // string already mapped to different character
                if(!sMap.get(s).equals(c)) return false;
            }
        }
        return true;
    }
}