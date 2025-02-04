// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null)
            return false;
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        String[] wordArray = s.split(" ");

        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            String wordString = wordArray[i].trim();
            if (!pMap.containsKey(patternChar)) {
                pMap.put(patternChar, wordString);
            } else {
                if (!pMap.get(patternChar).equals(wordString)) {
                    return false;
                }
            }

            if (!sMap.containsKey(wordString)) {
                sMap.put(wordString, patternChar);
            } else {
                if (!sMap.get(wordString).equals(patternChar)) {
                    return false;
                }
            }
        }
        return true;

    }
}