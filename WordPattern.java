/*
    1. Time Complexity : O(n + m) , n - length of pattern; m - length of s
    2. Space Complexity : O(1) , max 26 entries in each HashMap
    3. Did this code successfully run on Leetcode : Yes
    4. Any problem you faced while coding this : -
 */

/*
 * Same as isomorphic strings
 */
import java.util.HashMap;
class Solution {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        String[] words = s.split(" ");
        int i = 0, j = words.length;
        if (pattern.length() != j) return false;
        char c;
        for (int k = 0; k < pattern.length() && i < j; ++k, ++i) {
            c = pattern.charAt(k);
            // System.out.println(c + " " + words[i]);
            if (map.containsKey(c) && !words[i].equals(map.get(c))) return false;
            map.put(c, words[i]);
            if (wordMap.containsKey(words[i]) && c != wordMap.get(words[i])) return false;
            wordMap.put(words[i], c);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abba" , t = "dog cat cat dog";
        System.out.println("String "+ t + " follows pattern "+ s + " : " + wordPattern(s, t));
    }
}