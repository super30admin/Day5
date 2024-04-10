// Time Complexity : O(N) - N is the length of input string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] temp = s.split(" ");
        if(pattern.length() != temp.length)
            return false;
        Map<Character, String> hm = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = temp[i];
            if(hm.containsKey(c)) {
                if(!hm.get(c).equals(word)) {
                    return false;
                }
            }
            else {
                if(hm.containsValue(word)) {
                    return false;
                }
                hm.put(c, word);
            }
        }
        return true;
    }
}
