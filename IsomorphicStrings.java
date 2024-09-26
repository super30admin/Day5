//Time complexity : O(n) where n is length of string
//Space complexity : O(1)
//Did this code run on leetcode : yes
//Did you face any problem : no

import java.util.HashMap;
class Solution {
    public boolean IsomorphicStrings(String s, String t) {
        //null case
        if(s== null || t == null) return false;
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, tChar);
            }
            else{
                if(sMap.get(sChar) != tChar) return false;
            }
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar, sChar);
            }
            else{
                if(tMap.get(tChar) != sChar) return false;
            }
        }
        return true;
        
    }
}