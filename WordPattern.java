/*
LC 205: Medium: https://leetcode.com/problems/isomorphic-strings/submissions/
Time Complexity : O(n)
Space Complexity : O(n*l) + O(number_of_unique_words); n - no of characters in the pattern, l - average length
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no

Your code here along with comments explaining your approach
Use a HashMap and a HashSet
2 HashMaps can be used in place of this
*/

import java.util.HashMap;
import java.util.HashSet;
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        String[] words = str.split(" ");
        
        if (words.length != pattern.length()) {
            return false;
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char a = pattern.charAt(i);
            if (map.containsKey(a) && !map.get(a).equals(words[i])) {
                return false;
            }
            map.put(a, words[i]);
            set.add(words[i]);
            
            if (set.size() != map.size()) {
                return false;
            }
        }
        return true;
    }
}