// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes

import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        char[] patternArr = pattern.toCharArray();
        String[] sArr = s.split(" ");
        if (patternArr.length != sArr.length) {
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String str = sArr[i];
            if((map.containsKey(c)) && (!map.get(c).equals(str)) || (map2.containsKey(str)) && (!map2.get(str).equals(c)) ){
                return false;
            }
            else{
                map.put(c,str);
                map2.put(str, c);
            }
        }

        return true;
    }
}
