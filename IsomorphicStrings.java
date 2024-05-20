import java.util.HashMap;

//Problem 2:
//Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

//Example 1: Input: s = "egg", t = "add" Output: true

//Example 2: Input: s = "foo", t = "bar" Output: false

//Time Complexity - o(n)
//Space Complexity - 0(n) - 0(1) - because characters are constant to 26 or even 52 considering both small and capital letters
//Approach
// if string lengths are not equal to each other return false. Because they cannot be isomorphic if they are nit equal in length

// take two hashmaps one for each strings.
// start iterating through  length of  strings(any one string as they are equal)
//map each character in string s to character in string t for each index.
// map each character in string t to character in string s for each index.
// while doing so if we find any given character is mapped to different character than the current one already, then return false.
// if the mapping doesnt break until the loop completes then return true;



public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap.containsKey(sChar)) {
                if (sMap.get(s.charAt(i)) != tChar) {
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }
            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            } else {
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}
