// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// https://leetcode.com/problems/word-pattern/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null)  return false;
        String sArr[] = s.split(" ");
        if (pattern.length() != sArr.length)  return false;
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++) {
            char pCh = pattern.charAt(i);
            String str = sArr[i];
            if (!pMap.containsKey(pCh)) {
                pMap.put(pCh, str);
            }else if(!pMap.get(pCh).equals(str)) return false;

            if (!sMap.containsKey(str)) {
                sMap.put(str, pCh);
            }else if(!sMap.get(str).equals(pCh)) return false;
        }
        return true;
    }
}