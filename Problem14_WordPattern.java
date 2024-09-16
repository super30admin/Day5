// Time Complexity : O(n), n -> number of words in the s
// Space Complexity : O(m), m -> number of unique characters in pattern and words in s 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(pattern.length() != word.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < word.length; i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(word[i]))
                    return false;
            } else {
                if(map.containsValue(word[i]))
                    return false;
                map.put(pattern.charAt(i), word[i]);
            }
        }
        return true;
    }
}