// Time Complexity : O(n), 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package hashing1;
import java.util.*;
public class PatternMatch {

    public boolean wordPattern(String pattern, String s) {
        if (s.length() == 0 || s == null || pattern.length() == 0 || pattern == null) {
            return false;
        }
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        //char [] ch = new char [];
        String[] sArray = s.split(" ");
        if (sArray.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < sArray.length; i++) {
            if (!pMap.containsKey(pattern.charAt(i))) {
                pMap.put(pattern.charAt(i), sArray[i]);
            } else {
                if (!pMap.get(pattern.charAt(i)).equals(sArray[i])) {
                    return false;
                }
            }
            if (!sMap.containsKey(sArray[i])) {
                sMap.put(sArray[i], pattern.charAt(i));
            } else {
                if (!sMap.get(sArray[i]).equals(pattern.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
