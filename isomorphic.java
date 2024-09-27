// Time Complexity :O(n)
// Space Complexity :O(n) as I am making character arrays
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
    // make two hashmaps, one will store s as key and other will store t as key
    public boolean isIsomorphic(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for (int i = 0; i < sChar.length; i++) {
            // traversing through strings if value is already there,check if mapped value is
            // same in both
            // if not same, return false
            if ((smap.containsKey(sChar[i]) && smap.get(sChar[i]) != tChar[i])
                    || (tmap.containsKey(tChar[i]) && tmap.get(tChar[i]) != sChar[i])) {
                return false;
            } else {
                // else put in both hashmap
                smap.put(sChar[i], tChar[i]);
                tmap.put(tChar[i], sChar[i]);
            }
        }
        return true;
    }
}