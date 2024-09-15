// Time Complexity : O(N) where N is the length of wither string
// Space Complexity : O(2N) since we create 2 hashmaps
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
1. We are creating 2 hashmaps one to store mapping from pattern -> s and the other for s-> pattern
2. Everytime we get a char s and word in pattern we compare both to both hashmaps
3. If they are present and map to the same values then we ignore
4. If they are present and map to different value then we return false
5. If we pass all the test cases without any errors then we return true
*/

// Solution:

import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> patternMap = new HashMap<Character, String>();
        HashMap<String, Character> secondPatternMap = new HashMap<String, Character>();
        String[] arrOfStr = s.split(" ");
        if(arrOfStr.length != pattern.length())
            return false;

        for(int i=0;i<pattern.length();i++) {
            char curr = pattern.charAt(i);
            String currStr = arrOfStr[i];
            if(!patternMap.containsKey(curr) && !secondPatternMap.containsKey(currStr)){
                patternMap.put(curr, currStr);
                secondPatternMap.put(currStr, curr);
            }else if(patternMap.containsKey(curr) && !patternMap.get(curr).equals(currStr))
                return false;
            else if(secondPatternMap.containsKey(currStr) && !secondPatternMap.get(currStr).equals(curr))
                return false;
        }
        return true;
    }
}
