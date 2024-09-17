// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        Map<Character, Character> sMap = new HashMap<>();
        Set<Character> tSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char tChar = t.charAt(i);
            char sChar = s.charAt(i);
            if(sMap.containsKey(sChar)) {
                if(sMap.get(sChar) != tChar) return false;
                else {
                    if(tSet.contains(tChar)) return false;
                    else {
                        sMap.put(sChar, tChar);
                        tSet.add(tChar);
                    }
                }
            }
        }
        return true;
    }
}