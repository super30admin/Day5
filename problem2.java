// Time Complexity : O(n)
// Space Complexity : O(1) as we just have 26 letters
// Did this code successfully run on Leetcode :yes

import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap();
        HashMap<Character,Character> tMap = new HashMap();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);
            if(sMap.containsKey(ch)) {
                if(sMap.get(ch) != ch1)
                    return false;
            }
            if(tMap.containsKey(ch1)) {
                if(tMap.get(ch1) != ch)
                    return false;
            }
            if(!sMap.containsKey(ch)) {
                sMap.put(ch,ch1);
            }
            if(!tMap.containsKey(ch1)) {
                tMap.put(ch1,ch);
            }
    }
           
        return true;
    }
}