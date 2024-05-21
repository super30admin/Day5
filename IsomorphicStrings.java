/*
    LC - 205 Isomorphic Strings
    TC - O(n)
    SC - O(1)
    Approach - 
        Possible solutions can be done using (two hashmap, one hashmap and hashset, using two array declaration, one hashmap).
        In this solution, I have used hashmap with hashset and check if exists in set before adding it and return accordingly.
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> mySet = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)) {
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
                if(mySet.contains(tChar)) {
                    return false;
                }
                mySet.add(tChar);
            }
        }
        return true;
    }
}