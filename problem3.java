// Time Complexity : O(n)
// Space Complexity : O(1) as we just have 26 letters
// Did this code successfully run on Leetcode :yes

import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(strs.length!=pattern.length())
            return false;
        HashMap<Character, String> sMap = new HashMap();
        HashMap<String, Character> tMap = new HashMap();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = strs[i];
            if(sMap.containsKey(ch) && !sMap.get(ch).equals(word))
            {
                return false;
            }
            if(tMap.containsKey(word) && tMap.get(word)!=ch)
                return false;
            if(!sMap.containsKey(ch)){
                sMap.put(ch,word);
            }
            if(!tMap.containsKey(word)){
                tMap.put(word,ch);
            }
        }
        return true;
    }
}