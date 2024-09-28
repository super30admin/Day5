// Time Complexity : O(N)
// Space Complexity : O(1) since there are at the most 26 characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> theMap = new HashMap<>(); // God of all hashmaps
        int len = s.length();
        HashSet<Character> theSet = new HashSet<>();

        for (int i = 0; i < len; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(!theMap.containsKey(sChar)) {
                // Key is not present in teh hashmap
                // Add schar to Hashmap with tchar value
                // Add tchar to Hashset
                theMap.put(sChar, tChar);
                if (theSet.contains(tChar)) {
                    // found non isomorphic
                    return false;
                }
                theSet.add(tChar);
            } else {
                // Key is present in the hashmap
                // Check if the values are equal or not
                if (tChar == theMap.get(sChar)) {
                    continue;
                } else {
                    return false;
                }

            }
        }
        return true;
    }
}