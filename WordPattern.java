// Time Complexity :  O(n)
// Space Complexity : O(m+n) : m - > len(pattern), n - > len(str)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// By observing this problem, it is clear that the individual characters in the pattern should be mapped to the words in the given string. This concept has been applied here using hasmap wherein the character is key and word in string is its corresponding value.

class Solution {
    public boolean wordPattern(String pattern, String str) {
        // edge case
        if(pattern == null || str == null) {
            return false;
        }
        // creating array of strings by splitting based on whitespace.
        String[] words = str.split("\\W+");
        // matching the length of pattern with number of words
        if(pattern.length() != words.length) {
            return false;
        }
        
        // creating a map with key as character in pattern and value as the word in string
        Map<Character, String> map = new HashMap();
        for(int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            // checking if map already contains the current character to word mapping
            if(map.containsKey(ch)) {
                // if the values differ for the same key, return false
                if(!map.get(ch).equals(words[i])) {
                    return false;
                }
            }
            // if current key is not found in map and current value is found in map , mapped to a different key, return false
            else if(map.containsValue(words[i])){
                return false;
            }
            map.put(ch, words[i]);
        }
        
        return true;
    }
}