// Time Complexity : O(m) => If we consider the pattern is of length n and if number of words in s are m. In split operator, if there are m words in s, then TC will be O(m)
// Space Complexity : O(1) => Constant space compleexity as we are not utizlizing additional space. If we only consider lowercase then max size will be 26.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: Take 1 HasMap & 1 HashSet. Map will store mapping of pattern to s and set will store key of s.
If the key in pattern map exists check if it matches with the char in the s string. If the key in pattern map doesn't exists we add to pattern map but also check if that key exists in the set.
If the key exists in the set exists it indicates the key was mapped earlier with a different word then return false else add the key in the set if it seen for the first time
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] splittedString = s.split(" "); //Splitting the string s to compare individual words

        if (splittedString.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>(); //Contains mapping of pattern to string s
        HashSet<String> sSet = new HashSet<>(); //Contains key of string s

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
                if(sSet.contains(str)){
                    return false;
                }
                sSet.add(str);
            }

        }
        return true;
    }
}