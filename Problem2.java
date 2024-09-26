// Time Complexity : O(s+t) = O(2n) = O(n) where n length of any 1 string
// Space Complexity : O(n) where n is total number of characters in both strings
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

public class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            if(sMap.containsKey(s.charAt(i))) {
                if(t.charAt(i) == sMap.get(s.charAt(i))) {
                    continue;
                }
                
                return false;
            } else {
                sMap.put(s.charAt(i), t.charAt(i));
            }
            
            if(tMap.containsKey(t.charAt(i))) {
                if(s.charAt(i) == tMap.get(t.charAt(i))) {
                    continue;
                }
                
                return false;
            } else {
                tMap.put(t.charAt(i), s.charAt(i));
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        String s = "adde";
        String t = "egge";
        System.out.println(obj.isIsomorphic(s, t));
    }
}
