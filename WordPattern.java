//Time complexity: O(n+m) n-length of s, m-length of pattern
//Space complexity: O(n) n-length of s
import java.util.*;
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        HashMap hm = new HashMap();

        for(Integer i=0;i<words.length;i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(!hm.containsKey(c)){
                hm.put(c, i);
            }

            if(!hm.containsKey(word)){
                hm.put(word, i);
            }

            if(hm.get(c) != hm.get(word)){
                return false;
            }
        }
        return true;
    }
}