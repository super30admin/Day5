// Time Complexity : O(n) where n is number of characters in the pattern or number of words in string
// Space Complexity : O(N) - used by the hashMaps.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : was pretty much the same as isomorphic once I got it.

import java.util.*;

public class StringPattern {
    public static void main(String[] args) {
        String s = "abba";
        String t = "dog cat cat dog";

        StringPattern sp = new StringPattern();
        boolean response = sp.wordPattern(s, t);

        System.out.println(response);
    }

    public boolean wordPattern(String pattern, String str) {
        
        //split the string into individual pattern strings
        String[] strs = str.split("\\s+");
    
        //don't bother if the pattern length is different than the array length
        if(strs.length != pattern.length()) {
            return false;
        }

        Map<Character, String> isoMapS = new HashMap<>();
        Map<String, Character> isoMapT = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            Character iS = pattern.charAt(i);
            String iT = strs[i];
            
            //create mapping in pattern map if not present
            if(isoMapS.get(iS) == null) {
                isoMapS.put(iS, iT);
            } else {
                //if mapping present, check if it matches current word
                //if not, pattern mismatch
                if(!isoMapS.get(iS).toString().equals(iT)) {
                    return false;
                }
            }
            
            //create mapping in string map if not present
            if(isoMapT.get(iT) == null) {
                isoMapT.put(iT, iS);
            } else {
                //if mapping present, check if it matches current pattern char
                //if not, pattern mismatch
                if(!(isoMapT.get(iT) == iS)) {
                    return false;
                }
            }
         }
        
         //pattern matches the string
        return true;
    }
}