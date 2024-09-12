// Time Complexity : O(n) where n is the length of either of the string
// Space Complexity : O(1) because there are only 26 alphabets
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        // 2 HashMaps solution
        
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
                sMap.put(sChar, tChar);
            }
            
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }
            else{
                tMap.put(tChar, sChar);
            }
        }
        
        return true;
    }
}