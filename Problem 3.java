// Problem 3: 

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Missed some of the edge cases in the initial attemps


// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length() == 0 && s.length() == 0) return true;
        
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length) return false;
        HashMap<Character, String> patternmap = new HashMap<Character, String>();
        HashMap<String, Character> smap = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            if(!patternmap.containsKey(pattern.charAt(i))) {
                patternmap.put(pattern.charAt(i),words[i]);
            } else {
                if(!patternmap.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                } 
            }
            if(!smap.containsKey(words[i])) {
                smap.put(words[i],pattern.charAt(i));
            } else {
                if(!smap.get(words[i]).equals(pattern.charAt(i))) {
                    return false;
                } 
            }
        }
        return true;
    }
}