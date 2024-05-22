// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach in three sentences only
// Create Hash map for string s and t
// check if value corresponding to key in s matches with charecter in string t
// Simillarly check if value corresponding to key in t matches with charecter in string s

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length() || s == null || t == null){
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }
            else{
                sMap.put(sChar,tChar);
            }
            
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }
            else{
                tMap.put(tChar,sChar);
            }
    
        }
        return true;
    }
} 