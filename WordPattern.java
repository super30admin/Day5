// Time Complexity : O(n)
// Space Complexity : O(m+n) where m is unique chars in pattern and n is unique words in s
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no
import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap map = new HashMap();
        String[] words = s.split(" ");

        if(pattern == null || s == null || words.length != pattern.length())
            return false;

        for(Integer i=0; i<words.length; i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(!map.containsKey(c)){
                map.put(c,i);
            }
            if(!map.containsKey(word)){
                map.put(word,i);
            }
            // check index of the occurences, if not same, they are out of order (break of pattern)
            if(map.get(c) != map.get(word)){
                return false;
            }
        }
        return true;
    }
}
