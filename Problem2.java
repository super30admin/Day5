/*
https://leetcode.com/problems/isomorphic-strings/
Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
Example 1: Input: s = "egg", t = "add" Output: true
Example 2: Input: s = "foo", t = "bar" Output: false
Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.
*/

import java.util.*;
class Problem2 {

    //Time Complexity : O(N)
    //Space Complecity : O(1)
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        char map[] = new char[128]; // source -> target
        char reverseMap[] = new char[128]; // target -> source
        Arrays.fill(map, '|');
        Arrays.fill(reverseMap, '|');
        for (int i = 0; i < s.length(); i++) {
            char source = s.charAt(i);
            char target = t.charAt(i);
            char mapped_character = map[source];
            char reverse_character = reverseMap[target];
            if (mapped_character == '|' && reverse_character == '|') { // Not yet mapped
                map[source] = target;
                reverseMap[target] = source;
            } else if (mapped_character == '|' && reverse_character != '|') {
                if (reverse_character == source) {
                    map[source] = target;
                } else {
                    return false;
                }
            } else if (mapped_character != target) {
                return false;
            }
        }

        return true;
    }
}
