//Problem:
205.Isomorphic Strings

        Given two strings s and t,determine if they are isomorphic.

        Two strings s and t are isomorphic if the characters in s can be replaced to get t.

        All occurrences of a character must be replaced with another character while preserving the order of characters.No two characters may map to the same character,but a character may map to itself.

//-----------------Approach1---------------------
// Time Complexity : O(N)
// Space Complexity : O(1) as it can have only 256 possible ASCII characters
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Map each character of first string to another string using HashMap. Similarly map each char of String t to another String S using another Map
If same character repeats check if key is present and if the value matches with another String's char
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) return true;

        if (s.length() != t.length()) return false;

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i), tchar = t.charAt(i);

            if (sMap.containsKey(schar) && sMap.get(schar) != tchar)
                return false;
            else {
                sMap.put(schar, tchar);
            }
            if (tMap.containsKey(tchar) && tMap.get(tchar) != schar)
                return false;
            else {
                tMap.put(tchar, schar);
            }
        }
        return true;
    }
}


//-------Approach2--------------

// Time Complexity : O(N2) N square as we need to iterate through each char of the input string and map.containsValue(val) checks for all entries which is another O(N)
// Space Complexity : O(1) as it can have only 256 possible ASCII characters
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Map each character of first string to another string using HashMap.
If same character repeats check if key is present and if the value matches with it
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) return true;

        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i), tchar = t.charAt(i);

            if (map.containsKey(schar)) {
                if (map.get(schar) != tchar)
                    return false;
                else continue;
            } else {
                if (!map.containsValue(tchar)) {
                    map.put(schar, tchar);
                } else return false;
            }
        }
        return true;

    }
}