// Time complexity: O(n) where n is the length of the string.
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;
class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();       // Initialize HashMap.
        HashSet<Character> set = new HashSet<>();                   // Initialize HashSet.
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)) {          // If character not present in hashmap, add the character.
                sMap.put(sChar, tChar);
                if(set.contains(tChar)) {           // If hashset contains the character in second string, it is already mapped before. 
                    return false;
                }
                set.add(tChar);                     // If hashset does not contain the character, i.e., not already mapped, add it into hashset.
            }
            else {
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            }
        }
        return true;
    }
}