// Time Complexity :
// O(n)
//// Space Complexity :O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.HashMap;

class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        if(s.equals(t)){
            return s.equals(t);
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i=0; i<s.length();i++){
            char S1 = s.charAt(i);
            char T1 = t.charAt(i);
            if (map.containsKey(S1)){
                if(!map.get(S1).equals(T1)){
                    return false;
                }
            }
            else{
                if (!map.containsValue(T1)){
                    map.put(S1,T1);
                }
                else{
                    return false;
                }

            }




        }
        return true;
    }
}