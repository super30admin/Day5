//Time complexity: O(N), where N is the length of the String s.
//Space complexity: O(K), where K is the number of words in s. 

import java.util.*;

class Solution3 {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        //if pattern length or words length is not equal, return false;
        if (pattern.length() != words.length)
            return false;
        //hashmap for mapping word to pattern 
        HashMap<String, Character> wp = new HashMap<>();
        //hashmap for mapping pattern to word
        HashMap<Character, String> pw = new HashMap<>();
        for(int i=0; i<words.length; i++) {
            String w = words[i];
            char p = pattern.charAt(i);
            //check if word or pattern already exists in the map, and if their corresponding values are the same as current pattern or word, respectively, return false. 
            if ((wp.containsKey(w) && wp.get(w) != p) || (pw.containsKey(p) && !pw.get(p).equals(w))) {
                return false;
            }
            //put the new mappings in both the map. 
            wp.put(w, p);
            pw.put(p, w); 
        }
        return true; 
    }
}