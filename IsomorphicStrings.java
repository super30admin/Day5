// Time Complexity : O(n), where n is the length of the string s or t
// Space Complexity : O(1), since only 26+26=52 chars are stored in hashmap at max
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        //If the length of strings s and t are not equal, return false
        if(s.length() != t.length()) return false;

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                //if smap already contains schar but the value is not equal to tchar, then return false
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            }
            else{
                //if smap doesn't contain schar, put schar and tchar in the map
                sMap.put(sChar, tChar);
            }

            if(tMap.containsKey(tChar)){
                //if tmap already contains tchar but the value is not equal to schar, then return false
                if(tMap.get(tChar) != sChar) {
                    return false;
                }
            }
            else{
                //if tmap doesn't contain tchar, put tchar and schar in the map
                tMap.put(tChar, sChar);
            }
        }
        //return true if all the characters match in both the maps
        return true;
    }
}