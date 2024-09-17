// Time Complexity : O(n) 
// Space Complexity : O(1), as constraint is, s & t are of valid ascii characters
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge conditions
        if(s==null || t==null || s.length()!=t.length())
            return false;
        
        //taking 2 hashmaps, one for mapping and another for reverse mapping
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(!sMap.containsKey(sChar))   //key, value pair inserted if not present
                sMap.put(sChar, tChar);
            
            if(!tMap.containsKey(tChar))   //key, value pair inserted if not present
                tMap.put(tChar, sChar);
            
            //comparison of mapping and it's reverse mapping
            if(sMap.get(sChar)!=tChar || tMap.get(tChar)!=sChar)
                return false;
        }
        return true;   
    }
}