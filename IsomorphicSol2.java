// Time Complexity : O(N) => As we are traversing through the string, TC will be O(N). Insertion and lookup takes O(1) in HashMap.
// Space Complexity : O(1) => Constant space compleexity as we are not utizlizing additional space. If we only consider lowercase then max size will be 26.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: Take 1 HasMap and 1 HashSet. Map will store mapping of s to t and set will store key of t string.
If the key in s map exists check if it matches with the char in the t string. If the key in t set exists, it indicates that the key was mapped with a different character.
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if ((s.length() != t.length()) || (s.length() == 0 || s == null) || (t.length() == 0 || t == null))
            return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Checks if that key from s exist in the map, if it does it should match with
            // the 't' character
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar)
                    return false;
            } else {
                sMap.put(sChar, tChar);
                // Checks if that key from t exists in the map, if it does it should match with
                // the 's' character
                if (tSet.contains(tChar)) {
                    return false;
                } else
                    tSet.add(tChar);
            }

        }

        return true;
    }