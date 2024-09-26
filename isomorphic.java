// Time Complexity : O(n)
// Space Complexity : O(n*m)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if(sMap.containsKey(sChar)) {
                if(tChar != sMap.get(sChar)) return false;
            } else {
                sMap.put(sChar, tChar);
            }

            if(tMap.containsKey(tChar)) {
                if(sChar != tMap.get(tChar)) return false;
            } else {
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}
