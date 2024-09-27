// Time Complexity - O(N)
// Space Complexity - O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();

        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        for(int i=0; i<pattern.length(); i++) {

            char pChar = pattern.charAt(i);

            String word = words[i];

            if(!pmap.containsKey(pChar)) {
                pmap.put(pChar, word);

            } else {
                if(!pmap.get(pChar).equals(word))
                    return false;
            }

            if(!smap.containsKey(word)){
                smap.put(word, pChar);

            }else{
                if(!smap.get(word).equals(pChar))
                    return false;
            }
        }

        return true;
    }
}