// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        if(s.length() != t.length()) return false;
        
        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0; i< s.length() ; i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar))
            {
                if(tChar != sMap.get(sChar))
                {
                    return false;
                }
            }
            else 
            {
                if(set.contains(tChar))
                {
                    return false;
                }
                set.add(tChar);
                sMap.put(sChar,tChar);
            }
        }
        return true;
        
    }
}