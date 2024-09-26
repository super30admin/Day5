/**
 * Approach 1
 Time Complexity: O(n): as we are iterating over the length of string
 Space complexity: O(n)
 Approach: so here we are having map to store corresponding mapping of S to t charcters but what will happen if b in S is mapped to d in t but we later receive b in T and different character in S so we maintain set storing occurance of T
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!map.containsKey(sChar)) {
                if(set.contains(tChar)) return false;
                map.put(sChar, tChar);
                set.add(tChar);
            }
            else {
                if(map.get(sChar) != tChar) {
                    return false;
                }
            }
        }
        return true;
    }
}

/**
Approach 2
        Time Complexity: O(n): as we are iterating over the length of string
        Space complexity: O(1)
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] maps = new char[256];
        char[] mapt = new char[256];

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(maps[sChar] == 0  && mapt[tChar] == 0) {
                maps[sChar] = tChar;
                mapt[tChar] = sChar;
            } else if(maps[sChar] != tChar || mapt[tChar] != sChar) {
                return false;
            }

        }
        return true;
    }
}