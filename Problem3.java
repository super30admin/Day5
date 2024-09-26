import java.util.HashMap;
// Time Complexity
// With bruteforce solution: 
// With hashing: O(n)
// Where n = length of s/t
// Space Complexity
// With bruteforce solution:
// With hashing Optimization: O(n)

//For some reason this code isn't working and returning false in "if (pMap.get(pChar) != sStr)" condition.
//Please check it.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null) // Check for the empty string
            return false;
        if (pattern.length() == 0 || s.length() == 0)
            return false;

        HashMap<String, Character> sMap = new HashMap<>(); // Hashmap for string s
        HashMap<Character, String> pMap = new HashMap<>(); // Hashmap for pattern

        for (int i = 0; i < pattern.length(); i++) { // Iterate over pattern length
            char pChar = pattern.charAt(i); // check the character at ith position in pattern

            String sStr = s.split(" ")[i]; // check the substring at ith position in string s by splitting it on space

            if (!sMap.containsKey(sStr)) { // check if the smap cotains the substring of string s
                sMap.put(sStr, pChar); // if not, add it to smap
            } else {
                if (sMap.get(sStr) != pChar) // if found, check if value with that key equals to character of p
                    return false;
            }

            if (!pMap.containsKey(pChar)) { // check if the pmap cotains the character of p
                pMap.put(pChar, sStr);
            } else {
                if (pMap.get(pChar) != sStr) // if found, check if value with that key equals to substring of s
                    return false;
            }
        }
        return true; // Return true at the end
    }
}