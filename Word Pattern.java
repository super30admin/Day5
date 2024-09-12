
/*
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if len(s) != len(pattern):
            return False
        
        char_map = {}
        word_map = {}
        
        for i in range(len(s)):
            if pattern[i] in char_map:
                if char_map[pattern[i]] != s[i]:
                    return False
            else:
                char_map[pattern[i]] = s[i]
                
            if s[i] in word_map:
                if word_map[s[i]] != pattern[i]:
                    return False
            else:
                word_map[s[i]] = pattern[i]
        return True
*/

// Time Complexity : O(n) where n is size of string or pattern
// Space Complexity : O(1) as alphabets are only 26 characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach: I have used two hashmap to store mapping from characters to words
// words to character


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arrOfS = s.split(" ");
        if (pattern.length() != arrOfS.length){
            return false;
        }
        HashMap<Character, String> char_map = new HashMap<>();
        HashMap<String, Character> word_map = new HashMap<>();
        for (int i=0; i<arrOfS.length; i++){
            char pattern_char = pattern.charAt(i);
            String word = arrOfS[i];
            if (char_map.containsKey(pattern_char)){
                if (!(char_map.get(pattern_char).equals(word))){
                    return false;
                }
            }else{
                char_map.put(pattern_char, word);
            }
            if (word_map.containsKey(word)){
                if (!(word_map.get(word).equals(pattern_char)))
                    return false;
            }else{
                word_map.put(word, pattern_char);
            }
        }
        return true;
    }
}