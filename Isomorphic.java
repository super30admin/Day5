//TC: O(N)
//SC: O(1)

import java.util.*;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            //If map for S doesn't contain current character, insert it map with T's character
            if(!smap.containsKey(sChar)){
                smap.put(sChar,tChar);
            } else {
                //IF it contains the character, but is not mapped to current T's character, return false
                if(smap.get(sChar) != tChar) return false;
            }

            //If map for T doesn't contain current character, insert it map with S's character
            if(!tmap.containsKey(tChar)){
                tmap.put(tChar,sChar);
            } else {
                //IF it contains the character, but is not mapped to current S's character, return false
                if(tmap.get(tChar) != sChar) return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Isomorphic iso = new Isomorphic();

        System.out.println("Are egg, add Isomorphic: "+iso.isIsomorphic("egg","add"));
        System.out.println("Are foo, bar Isomorphic: "+iso.isIsomorphic("foo","bar"));
    }
}

/**
OUTPUT:

Are egg, add Isomorphic: true
Are foo, bar Isomorphic: false
 */