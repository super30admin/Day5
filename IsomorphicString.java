
// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Isomorphic string: two strings are isomorphic if we can replace characters in string1 to get string2.

Incorrect assumptions: Need a DS that tracks the position or order.

Corrected: Don't need a DS that preserves the order of the characters, since we can treverse through the both strings at the same index and check if the character at that index are isomprhic.

Approach:
* Variables needed: HashMap & HashSet 

1. we keep track of the character in String1 and its associated mapping in String2 in a HashMap.
2. While we keep the map- we also keep track of the mapping characters in a Set to keep track of all the unique values stored in HashMap.
     This helps avoid checking if value already exists which is O(n)
3. if we find a repeated character in String1 that is already mapped in HashMap ; 
    we check to see if the character in String2 is the same character that is stored prev. If it doesnot match strings are not isomporhic.
4. if we get a new character at an index from String1 and if the corresponding character in String2 is already present in the set, strings are not isomprohic
    i.e., there is already an existing map for the character at that index in String2.

5. If the strings doesn't return at 3 or 4 then its isomprhic

 * 
 */
import java.util.*;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> sMap = new HashMap<>();
        Set<Character> tSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }

            } else {

                if (tSet.contains(tChar))
                    return false;

                sMap.put(sChar, tChar);
                tSet.add(tChar);

            }
        }

        return true;

    }

}
