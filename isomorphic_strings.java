// Time Complexity : O(n) ,where n is the no. of characters in given string 
// Space Complexity : O(1) because total characters are constant
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//CODE

//Method-1 - using char arrays

public class isomorphic_strings {
    public boolean isIsomorphic(String s, String t) {
        // null case
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        char[] smap = new char[256]; // creating two char arrays
        char[] tmap = new char[256];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // we will insert the value corresponding to sChar in the array
            if (smap[sChar - ' '] == 0) { // (current char - first char) e - 'a' = 100 -96 =4 index in char array
                smap[sChar - ' '] = tChar; // if smap[schar - ' '] index does not contain anything ,then we will insert
                                           // tchar at that index
            } else {
                if (smap[sChar - ' '] != tChar)
                    return false; // if it already contains a value and that value doest not match with current
                                  // tChar then return false
            }
            // Doing same thing for tChar as well 
            //we will insert the value corresponding to tChar in the array
            if (tmap[tChar - ' '] == 0) {
                tmap[tChar - ' '] = sChar;
            } else {
                if (tmap[tChar - ' '] != sChar)
                    return false;
            }

        }
        return true;
    }
}

// METHOD-2 - using two hashmaps

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // null case
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!smap.containsKey(sChar)) {
                smap.put(sChar, tChar);
            } else {
                if (smap.get(sChar) != tChar)
                    return false;
            }
            if (!tmap.containsKey(tChar)) {
                tmap.put(tChar, sChar);
            } else {
                if (tmap.get(tChar) != sChar)
                    return false;
            }

        }
        return true;
    }
}
