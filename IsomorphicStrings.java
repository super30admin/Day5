import java.util.*;

// Time Complexity : O(N), where N = length of string s/t
// Space Complexity : 
//      cmap at max has 26 characters - O(1)
//      tmap at max has 26 characters - O(1)
//
//      SC = O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(!smap.containsKey(cs)){
                smap.put(cs, ct);
            }
            else{
                if(smap.get(cs) != ct){
                    return false;
                }
            }
            if(!tmap.containsKey(ct)){
                tmap.put(ct, cs);
            }
            else{
                if(tmap.get(ct) != cs){
                    return false;
                }
            }
        }
        return true;
    }
}