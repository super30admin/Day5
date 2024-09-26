// Time Complexity: O(1)
// Space Complexity: O(n log n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No problem while coding

import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        int plen = pattern.length();
        String[] words = s.split(" ");
        int slen = words.length;
        if(plen != slen) return false;
        HashMap<Character, String> hm1 = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();
        for(int i=0; i<plen; i++){
            char c = pattern.charAt(i);
            String word = words[i];
            if(hm1.containsKey(c)){
                String out = hm1.get(c);
                    if (!out.equals(word)){
                    return false;
                  }
            }
            else{
                hm1.put(c,word);
            }
            if(hm2.containsKey(word)){
                char ch = hm2.get(word);
                if(ch!=c){
                    return false;
                }
            }
            else{
                hm2.put(word,c);
            }
        }
        return true;
        
    }
}