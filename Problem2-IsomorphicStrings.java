// Time Complexity : O(n) where n is the length of the input string.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0; i< s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar))
            {   if(tMap.containsKey(tChar))
                   return false;
             
                sMap.put(sChar,tChar);
                tMap.put(tChar, sChar);
                
            }
            if(sMap.containsKey(sChar) && sMap.get(sChar)!=tChar)
                return false;
            if(tMap.containsKey(tChar) && tMap.get(tChar)!=sChar)
                return false;
            
            
        }
        return true;
    }
}