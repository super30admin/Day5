// Time Complexity : O(Nk), where N is the number of strings and k is the average length of each string
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String s){

        //Split the strings by space
        String[] strings = s.split(" ");
        //If the length of strings pattern and s are not equal, return false
        if(pattern.length() != strings.length) return false;

        Map<String, Character> sMap = new HashMap<>();
        Map<Character, String> patternMap = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char pChar = pattern.charAt(i);
            String str = strings[i];
            //if patternmap already contains pchar but the value is not equal to str, then return false
            if(patternMap.containsKey(pChar)){
                if(!patternMap.get(pChar).equals(str)){
                    return false;
                }
            }
            else {
                //if patternmap doesn't contain pchar, put pchar and str in the map
                patternMap.put(pChar, str);
            }
            //if smap already contains str but the value is not equal to pchar, then return false
            if(sMap.containsKey(str)){
                if(!sMap.get(str).equals(pChar)){
                    return false;
                }
            }
            else {
                sMap.put(str, pChar);
            }
        }
        //return true if all the characters match to the corresponding string in both the maps
        return true;
    }
}