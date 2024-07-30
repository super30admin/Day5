// Check if 2 strings are isomorphic or not.
// Time Complexity - O(n)
// Space Complexity - O(1) ----> In worst case, we only have to store 26 characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
	public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i<s.length();i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)) {
                char val= sMap.get(sChar);
                if(val != tChar) return false;
            } else{
                sMap.put(sChar,tChar);
            } 
        }

        for(int i = 0; i<t.length();i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(tMap.containsKey(tChar)) {
                char val= tMap.get(tChar);
                if(val != sChar) return false;
            } else{
                tMap.put(tChar,sChar);
            } 
        }
        return true;
    }
}
