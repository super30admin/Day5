//In this approach, two hashmaps are used to map characters from one string to another.
//One hashmap is used to map the characters from string s to string t and the other hashmap is used to map the characters from string t to string s.
//Time Complexity: O(n)
//Space Complexity: O(1) because the hashmap will have at most 26 characters.

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl!=tl) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();

        for(int i = 0; i<sl; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
            }else{
                if(sMap.get(sChar)!=tChar) return false;
            }
        }

        for(int i = 0; i<tl; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar,sChar);
            }else{
                if(tMap.get(tChar)!=sChar) return false;
            }
        }

        return true;

    }
}