/*
 Time Complexity : O(n)
 Space Complexity : O(1)
 Executed in Leetcode : Yes
 */


class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> sMap = new HashMap<Character, Character>();
        HashMap<Character, Character> tMap = new HashMap<Character, Character>();
        
        if(s.length() != t.length())
            return false;
        for(int i=0;i<t.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar))
            {
                if(sMap.get(sChar) != tChar)
                    return false;     
            }
            else
            {
                sMap.put(sChar,tChar);
            } 
            
            if(tMap.containsKey(tChar))
            {
                if(tMap.get(tChar) != sChar)
                    return false;   
            }
            else
            {
                tMap.put(tChar,sChar);
            }
        }
        return true;
    }
}