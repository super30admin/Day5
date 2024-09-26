// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
    We have two maps - one with char as key and string as value, another with string as key and char as value.
    If map1 contains the character, the word should be equal to its value.
    Otherwise, we add the key value pairs to the maps.

*/
class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap <Character, String> map1 = new HashMap();
        HashMap <String, Character> map2 = new HashMap();
        String[] words = str.split(" ");

        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (!map1.containsKey(c)) {
                if (map2.containsKey(w)) {
                    return false;
                } else {
                    map1.put(c, w);
                    map2.put(w, c);
                }

            } else {
                String mapped_word = map1.get(c);
                if (!mapped_word.equals(w))
                    return false;
            }
        }
        return true;
        
    }
}