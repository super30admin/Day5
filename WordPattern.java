/**
 * @author Vishal Puri
 * // Time Complexity : O(n)    Where n is the length of the pattern string as we are interating over it.
 * // Space Complexity : O(n)   As algorithm uses an auxiliary map which stores all the strings
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this : No
 */

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] sa = s.split(" ");
        char[] ca = pattern.toCharArray();
        if(sa.length!=ca.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        for(int i=0; i<ca.length; i++){
            if(map.containsKey(ca[i])){
                if(!map.get(ca[i]).contentEquals(sa[i]))
                    return false;
            } else{
                if(map.containsValue(sa[i]))
                    return false;
                map.put(ca[i],sa[i]);
            }
        }
        return true;
    }
}
