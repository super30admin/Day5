// Isomorphic values
// It is both ways 1-1 mapping, hence one can use 2 hashmaps (or 2 arrays) or 1 hashmap and 1 hashset.
// the hashmap holds the s->t mapping and the hashset holds the t values.

/*
 * Time Complexity = O(n) <- 1 pass
 * Space complexity = O(1) <- max 26 mappings of key value pairs and 26 values in the set.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Isomorphic {
    /**
     * Second approach.
     * 1 hashmap and 1 hashset
     */
    public boolean isIsomorphic(String s, String t) {
        // contains mapping from s-> t , {s:t}.
        Map<Character, Character> sMap = new HashMap<>();
        // contains all characters of t 
        Set<Character> tSet = new HashSet<>();
        int j=0;
        while(j< s.length()) {
            if(sMap.containsKey(s.charAt(j))) {
                // yes
                if(sMap.get(s.charAt(j))!= t.charAt(j)) {
                    return false;
                }
            } else {
                // sMap does not contain s[i]-> t[i] mapping
                // checks for condition "ab" -> "ee"<- this should be false.
                if(tSet.contains(t.charAt(j))) {
                    return false;
                } else {
                    tSet.add(t.charAt(j));
                    sMap.put(s.charAt(j), t.charAt(j));
                }
            }
            
            j++;// not in overflow error
        }
        return true;
    }

/**
    
     * First approach. 2 hashmaps.
     
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        int i=0;
        while(i< s.length()) {
            if(sMap.containsKey(s.charAt(i))) {
                if(sMap.get(s.charAt(i))!= t.charAt(i)) {
                   return false;
                }   
            }else {
                // sMap does not contain s[i]
                // check whether tmap has it 
                if(tMap.containsKey(t.charAt(i))) {// tMap has it.
                    if(tMap.get(t.charAt(i))!= s.charAt(i) ) {
                        return false;
                    } else {
                        // tMap has value t[i]:s[i].
                        // and we are all clear.
                        // insert stuff into sMap.
                        sMap.put(s.charAt(i), t.charAt(i));
                    }
                } else {
                    // the characters do not exist in sMap and tMap.
                    sMap.put(s.charAt(i), t.charAt(i));
                    tMap.put(t.charAt(i), s.charAt(i));
                }
            }
            // increment the pointer.
            i++;
        }
        return true;
    }
    */
}