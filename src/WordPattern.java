// Check word pattern.
// Time Complexity - O(n)
// Space Complexity - O(1) ----> In worst case, we only have to store 26 characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> sMap = new HashMap<>();
        HashSet<String> tSet = new HashSet<>();
        String words[] = s.split(" ");
        if(pattern.length() != words.length) return false;
        for(int i=0;i<pattern.length();i++) {
            char sChar = pattern.charAt(i);
            String tChar = words[i];
            if(sMap.containsKey(sChar)) {
                String val = sMap.get(sChar);
                if(!val.equals(tChar)) return false;
            } else {
                if(!tSet.contains(tChar)) {
                    sMap.put(sChar,tChar);
                    tSet.add(tChar);
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}