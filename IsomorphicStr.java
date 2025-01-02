/* Description: We are storing mapping of each strings in hashmaps in first approach, 
    and then comparing whether equal.
 */
// Time Complexity : O(n) for all approach
// Space Complexity : O(1) - (No matter the size of input, the number of characters we have is only a-z/A-Z/Special chars i.e. constant)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach:
// Using two hashmaps:
import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Checking for base condition
        if (s.length() != t.length() || s.length() == 0 || s == null) {
            return false;
        }
        // Declaring & Initializing 2 HashMaps, one for each input string
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        // Running a loop on every single char in input string
        for (int i = 0; i < s.length(); i++) {
            // Getting the first char from both strings
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            // Check if smap already contains the mapping for first char
            if (smap.containsKey(schar)) {
                // If yes, check if the mapped value is equal to the first char in tmap or not
                if (smap.get(schar) != tchar) {
                    // If not equal, that means not isomorphic, return false
                    return false;
                }
            }
            // Else if smap does not contain the mapping
            else {
                // Add the mapping (key,value)
                smap.put(schar, tchar);
            }
            // Similarly, Check if tmap already contains the mapping for first char
            if (tmap.containsKey(tchar)) {
                // If yes, check if the mapped value is equal to the first char in smap or not
                if (tmap.get(tchar) != schar) {
                    // If not equal, that means not isomorphic, return false
                    return false;
                }
            }
            // Else if tmap does not contain the mapping
            else {
                // Add the mapping (key,value)
                tmap.put(tchar, schar);
            }
        }
        // If return false statement is not executed and it came out of for loop, that
        // means isomorphic
        return true;
    }
}

// Using hashmap and hashset:
class Solution1 {
    public boolean isIsomorphic(String s, String t) {
        // Checking for base condition
        if (s.length() != t.length() || s.length() == 0 || s == null) {
            return false;
        }
        HashMap<Character, Character> smap = new HashMap<>();
        // Instead of hashmap, use hashset for second string input
        HashSet<Character> tset = new HashSet<>();
        // Running a loop on every single char in input string
        for (int i = 0; i < s.length(); i++) {
            // Getting the first char from both strings
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            // Check if smap already contains the mapping for first char
            if (smap.containsKey(schar)) {
                // If yes, check if the mapped value is equal to the first char in tmap or not
                if (smap.get(schar) != tchar) {
                    // If not equal, that means not isomorphic, return false
                    return false;
                }
            } else {
                // Else if smap does not contain the mapping, add mapping (key,value)
                smap.put(schar, tchar);
                // If we are adding something in smap, we also need to add in tset
                // Simultaneously, Check if tset already contains first char
                if (tset.contains(tchar)) {
                    // If yes, that means we are not adding in tset even though we added in smap
                    // That means, not isomorphic
                    return false;
                }
                // Else add it in tset
                tset.add(tchar);
            }

        }
        // If return false statement is not executed and it came out of for loop, that
        // means isomorphic
        return true;
    }
}

// Using 2 char arrays:
class Solution2 {
    // Find method to return the equivalent ASCII value to the char
    private int find(char chr) {
        return (int) chr;
    }

    public boolean isIsomorphic(String s, String t) {
        // Checking for base condition
        if (s.length() != t.length() || s.length() == 0 || s == null) {
            return false;
        }
        // Declaring & Initializing 2 Arrays, one for each input string
        char[] sChar = new char[256];
        char[] tChar = new char[256];
        // Running a loop on every single char in input string
        for (int i = 0; i < s.length(); i++) {
            // Getting the first char from both strings
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            // Getting ASCII code for both char's
            int sIdx = find(schar);
            int tIdx = find(tchar);
            // Checking if the mapping from 'char in s' --> 'char in t' is done by storing
            // tchar at the index (which is equal to ASCII code of s)
            if (sChar[sIdx] == 0) {
                // If not done, do the mapping
                sChar[sIdx] = tchar;
            }
            // Else if mapping done, check that the value stored is equal to the tchar
            else if (sChar[sIdx] != tchar) {
                // If not, return false
                return false;
            }
            // Similarly, Checking if the mapping from 'char in t' --> 'char in s' is done
            // by storing schar at the index (which is equal to ASCII code of t)
            if (tChar[tIdx] == 0) {
                // If not done, do the mapping
                tChar[tIdx] = schar;
            } else {
                // Else if mapping done, check that the value stored is equal to the schar
                if (tChar[tIdx] != schar) {
                    // If not, return false
                    return false;
                }
            }

        }
        // If return false statement is not executed and it came out of for loop, that
        // means isomorphic
        return true;
    }
}
