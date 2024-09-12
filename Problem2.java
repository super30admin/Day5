// Time Complexity : O(N) Where N is length of String s and t
// Space Complexity : O(N) + O(26) max which is equivalent to O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
        if(sMap.containsKey(sChar)) //if character in s String is mapped to another character we compare if that mapping is equal to character in t string
            {
                if(sMap.get(sChar) != tChar) return false;
            }
        else{
                sMap.put(sChar,tChar); //if character in s String is not mapped to another character, then we map it with character in t string 
            }
        if(tMap.containsKey(tChar)) //similarly character in t String is mapped to another character we compare if that mapping is equal to character in s string
            {
            if(tMap.get(tChar) != sChar) return false;
            }
        else{
                tMap.put(tChar,sChar); //if character in t String is not mapped to another character, then we map it with character in s string
            }
        }
        return true;
    }
}
