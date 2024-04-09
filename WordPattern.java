
// Time Complexity : O(n) # n is the length of string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Similar to Isomorphic String:
 * We can map the pattern and the corresponding word into a map.
 * 
 * Variables needed: HashMap & HashSet
 * HashMap will keep track of the Character -> Word mapping
 * HashSet will keep track of the unique words that are mapped in HashMap
 * 
 * The order of a character vs string is checked via the trevarsal, they are being treversed using the same index.
 * 
 * When does the pattern fail?
 * 1. If the string associated to a character in hashMap doesn't match with the word in that particulat index.
 * 2. If the pattern character is already associated with a word - can be checked via hashSet
 * 
 * if it does not fail in the above two cases - it follows the pattern specified.
 * 
 */

import java.util.*;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> pMap = new HashMap<>();
        Set<String> sSet = new HashSet<>();

        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            char pChar = pattern.charAt(i);
            String word = words[i];
            if (pMap.get(pChar) != null) {

                if (!pMap.get(pChar).equals(word))
                    return false;

            } else {

                if (sSet.contains(word))
                    return false;

                pMap.put(pChar, word);
                sSet.add(word);
            }

        }
        return true;

    }

}
