// Time Complexity : O(n)
// Space Complexity : O(2n) HashMap Space; Order of n since two hashMaps
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach 
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            
            //s->t
            //check if sHashMap contains Char and if it maps to same chT
            if(sMap.containsKey(chS) && sMap.get(chS) != chT)
                return false;
            //else put the key from s and value from t to sMap
            else
                sMap.put(chS, chT);
            
            //t ->s
            //check if tHashMap contains Char and if it maps to same chS
            if(tMap.containsKey(chT) && tMap.get(chT) != chS)
                return false;
            //else put the key from t and value from s to tMap
            else
                tMap.put(chT, chS);
        }
        
        return true;
    }
}