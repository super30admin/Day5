//Time Complexity: O(N) where N is the length of the string
//Space Complexity: O(1)

//Approach: Map each character to one string to the corresponding character of second string using a Hashmap
//and compare if the next occurrences of each character maps correctly, return false if they don't.

import java.util.*;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(sMap.containsKey(sChar[i]))
            {
                if(sMap.get(sChar[i]) != tChar[i]) return false;
            }
            sMap.put(sChar[i], tChar[i]);
            
            if(tMap.containsKey(tChar[i]))
            {
                if(tMap.get(tChar[i]) != sChar[i]) return false;
            }
            tMap.put(tChar[i], sChar[i]);
        }
        
        return true;
    }
}