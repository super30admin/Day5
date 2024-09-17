// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.*;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();

        String[] sArray = s.split(" ");

        if (pattern.length() != sArray.length)
            return false;

        for (int i = 0; i < pattern.length(); ++i) {
            char c = pattern.charAt(i);

            if (pMap.containsKey(c)) {
                if (!pMap.get(c).equals(sArray[i]))
                    return false;
            }
            else {
                pMap.put(c, sArray[i]);
            }

            if (sMap.containsKey(sArray[i])) {
                if (!sMap.get(sArray[i]).equals(c))
                    return false;
            }
            else {
                sMap.put(sArray[i], c);
            }
        }

        return true;
    }
}