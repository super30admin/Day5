// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //base cases to check if either string is empty or if their sizes dont match
        if(s == null || t == null || s.length() != t.length())
            return false;
        
        //two maps, one for reverse mapping
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            //s -> t
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            //if map does not have the letter already then we add it
            if(!sMap.containsKey(sChar))
                sMap.put(sChar, tChar);
            if(!tMap.containsKey(tChar))
                tMap.put(tChar, sChar);
            
            //if the pairs do not match in either then its false
            if(sMap.get(sChar) != tChar || tMap.get(tChar) != sChar)
                return false;
            
        }
        return true;
    }
}