// Time Complexity : O(m) => If we consider the pattern is of length n and if number of words in s are m. In split operator, if there are m words in s, then TC will be O(m)
// Space Complexity : O(1) => Constant space compleexity as we are not utizlizing additional space. If we only consider lowercase then max size will be 26.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: Take 2 HasMap. One map will store mapping of pattern to s and other will store mapping of s to pattern.
If the key in pattern map exists check if it matches with the char in the s string. If the key in s map exists check if it matches with the string in the pattern map.
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] splittedString = s.split(" "); //Splitting the string s to compare individual words

        if (splittedString.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>(); //Contains mapping of pattern to string s
        HashMap<String, Character> sMap = new HashMap<>(); //Contains mapping of string s to pattern

        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i); //Extracting characters from the pattern
            String str = splittedString[i];

            //checks if the key exists in the patternMap if it does it's value should be the same
            if (patternMap.containsKey(pChar)) {
                if (!patternMap.get(pChar).equals(str)) {
                    return false;
                }
            } else {
                patternMap.put(pChar, str);
            }
            if (sMap.containsKey(str)) {
                if (!sMap.get(str).equals(pChar)) {
                    return false;
                }

            } else {
                sMap.put(str, pChar);
            }

        }
        return true;
    }
}