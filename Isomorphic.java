/**
// Time Complexity : O(n) 
// Space Complexity : O(1) (total number of alphabets will always be same)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :N/A
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> hmap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i<s.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(hmap.containsKey(sChar))
            {
                if(hmap.get(sChar)!=tChar)
                    return false;
            }else
            {
                if(set.contains(tChar)) return false;
                hmap.put(sChar,tChar);
                set.add(tChar);
            }
        }
        return true;
    }
}