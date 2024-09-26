// Time Complexity: O(1)
// Space Complexity: O(n log n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No problem while coding

import java.util.*;
public class isomorphicStrings {
        public boolean isIsomorphic(String s, String t) {
            if(s.length() != t.length()) return false;
            HashMap<Character, Character> hm1 = new HashMap<>();
            HashMap<Character, Character> hm2 = new HashMap<>();
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                char ch = t.charAt(i);
                if(hm1.containsKey(c)){
                    if(ch != hm1.get(c)){
                        return false;
                    }
                }
                else{
                    hm1.put(c,ch);
                }
                 if(hm2.containsKey(ch)){
                    if(c != hm2.get(ch)){
                        return false;
                    }
                }
                else{
                    hm2.put(ch,c);
                }
            }
            return true;
        }
    }
