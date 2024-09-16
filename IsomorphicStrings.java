package S30_Codes.Hashing_1;

// Time Complexity : O(n) // n = string s,t length
// Space Complexity : O(1)
// Hashing-1

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> S_TO_T_Map = new HashMap<>();
        Set<Character> T_Set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(S_TO_T_Map.containsKey(sChar)){
                if(S_TO_T_Map.get(sChar) != tChar)
                    return false;
            }
            else{
                if(T_Set.contains(tChar))
                    return false;
                else{
                    S_TO_T_Map.put(sChar, tChar);
                    T_Set.add(tChar);
                }
            }
        }
        return true;
    }
}