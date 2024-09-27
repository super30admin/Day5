/*
Leet Code Problem 290
Word Pattern
Language Used : Java
Link: https://leetcode.com/problems/word-pattern/
Runtime: 1 ms, faster than 80.10% of Java online submissions for Word Pattern.
Memory Usage: 36.8 MB, less than 64.45% of Java online submissions for Word Pattern.
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Check if length is differnt - edge case
        String[] str = s.split(" ");
        if(str.length!=pattern.length()) return false;
        HashMap<Character, String> MapOfS = new HashMap<>();
        HashMap<String, Character> MapOfT = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            //Take character alone
            char CharOfT = pattern.charAt(i);
            //check from S
            if(!MapOfS.containsKey(CharOfT)){
                MapOfS.put(CharOfT,str[i]);
            }
            else{
                if(!MapOfS.get(CharOfT).equals(str[i])) return false;
            }
            //check from T
            if(!MapOfT.containsKey(str[i])){
                MapOfT.put(str[i],CharOfT);
            }
            else{
                if(MapOfT.get(str[i])!= CharOfT) return false;
            }
        }
        return true;  
    }
}