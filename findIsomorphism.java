// Time Complexity : O(n)
// Space Complexity : O(2n)
// Did this code successfully run on Leetcode : yes
import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(sMap.containsKey(s.charAt(i)) && sMap.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            if(tMap.containsKey(t.charAt(i)) && tMap.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
            sMap.put(s.charAt(i), t.charAt(i));
            tMap.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}