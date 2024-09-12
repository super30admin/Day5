//Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//
//        Example 1: Input: s = "egg", t = "add" Output: true
//
//        Example 2: Input: s = "foo", t = "bar" Output: false
//
//        Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.

// Time Complexity: O(1)
// Space Complexxity: O(n)

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character,Character> maps = new HashMap<>();

        for(int i=0 ; i < s.length() ; i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(maps.containsKey(charS)){
                if(maps.get(charS) != charT) return false;
            }

            else{
                if(maps.containsValue(charT)) return false;
                maps.put(charS,charT);
            }
        }

        return true;
    }
}