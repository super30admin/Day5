// Time Complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach in three sentences only
/**
 * Approach: 
 * In this problem, I have to determine  if two strings, s and t, are isomorphic. So, I have used HashMap
 * to store the mapping of characters from string s to String t and ensure that each character in s maps uniquely to a character in t.
 * I have used HashSet to track characters t that have already been used in the mapping, and preventing duplicate mappings.
 * I iterated through both Strings, if any mapping already done or reuse of characters occurs, we return false, otherwise I returned true if the mapping is valid.
 *  
/**
 * Solving this problem using one HashMap and One HashSet
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {

        // If both Strings have different lengths or one of them is null or empty then they can't be isomorphic.
        if(s.length() != t.length() || s == null || s.length() == 0) {
            return false;
        }

        // HashMap to store the character mapping from string 's' to string 't'
        HashMap<Character, Character> sMap = new HashMap<>();

        // HashSet to keep track of already mapped characters in string 't'
        HashSet<Character> set = new HashSet<>();

        // Iterate through each character of both strings 's' and 't
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check if the current character from 's' has already been mapped to a character in 't'
            if(sMap.containsKey(sChar)) {
                // If it is mapped, check if the mapping matches the corresponding character in 't'
                if(sMap.get(sChar) != tChar) {
                    // If the mapping doesn't match, return false
                    return false;
                }
            } else {
                // If the character from 's' is not mapped yet, add the mapping from 's' to 't'
                sMap.put(sChar, tChar);
                // Check if the character from 't' has already been used for mapping
                if(set.contains(tChar)) {
                    return false; // If 'tChar' is already used, the strings cannot be isomorphic, return false
                } else {
                    // If 'tChar' is not used yet, add it to the set to mark it as used
                    set.add(tChar);
                }
            }
        }
        return true;
        
    }
}

        