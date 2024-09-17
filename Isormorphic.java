// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sTotMap = new HashMap<>();
        HashMap<Character,Character> tTosMap = new HashMap<>();

        for(int x = 0;x < s.length();x++){
            char charS = s.charAt(x);
            char charT = t.charAt(x);

            if(sTotMap.containsKey(charS) && sTotMap.get(charS) != charT)
                return false;
            else {
                sTotMap.put(charS,charT);
            }
            if(tTosMap.containsKey(charT) && tTosMap.get(charT) != charS)
                return false;
            else {
                tTosMap.put(charT,charS);
            }

        }
        return true;


    }
}