/*
Leet Code Problem 205
Isomorphic String
Language Used : Java
Link: https://leetcode.com/problems/isomorphic-strings/

*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Check if length is differnt - edge case
        if(s.length()!=t.length()) return false;
        HashMap<Character, Character> MapOfS = new HashMap<>();
        HashMap<Character, Character> MapOfT = new HashMap<>();
        for(int i=0;i<s.length();i++){
            //Take character alone
            char CharOfS = s.charAt(i);
            char CharOfT = t.charAt(i);
            //check from S
            if(!MapOfS.containsKey(CharOfS)){
                MapOfS.put(CharOfS,CharOfT);
            }
            else{
                if(MapOfS.get(CharOfS)!= CharOfT) return false;
            }
            //check from T
            if(!MapOfT.containsKey(CharOfT)){
                MapOfT.put(CharOfT,CharOfS);
            }
            else{
                if(MapOfT.get(CharOfT)!= CharOfS) return false;
            }
        }
        return true;   
    }
}