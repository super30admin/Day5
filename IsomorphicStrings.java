// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Character> sMap = new HashMap();
        HashMap<Character, Character> tMap = new HashMap();
        
        for(int i=0; i<s.length(); i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), t.charAt(i));
            }
            else{
                if(sMap.get(s.charAt(i)) == t.charAt(i))
                    continue;
                else
                    return false;
            }
        }
        
        for(int i=0; i<s.length(); i++){
            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i), s.charAt(i));
            }
            else{
                if(tMap.get(t.charAt(i)) == s.charAt(i))
                    continue;
                else
                    return false;
            }
        }
        
        return true;
    }
}