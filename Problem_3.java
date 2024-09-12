// Time Complexity : O(N) where n = length of s or t
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        if (pattern.length() != strArr.length)
            return false;

        for (int i = 0; i < pattern.length(); i += 1) {
            if (patternMap.get(pattern.charAt(i)) == null) {
                patternMap.put(pattern.charAt(i), strArr[i]);
            } else {
                if (!patternMap.get(pattern.charAt(i)).equals(strArr[i])) {
                    return false;
                }
            }
            if (sMap.get(strArr[i]) == null) {
                sMap.put(strArr[i], pattern.charAt(i));
            } else {
                if (sMap.get(strArr[i]) != pattern.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
