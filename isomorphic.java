// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : nO

/* Approach: We create a hashmap and a hashset, hashmap to map character from one string to another and a hash set to store characters of 
 * t string making sure they have not already been interated over or mapped to another character
  */


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length() || s == null || t == null || s.length() == 0 || t.length() == 0){
            return false;
        } // basic edge case

        HashMap<Character, Character> smap = new HashMap<>(); // hash map to map char from s to t
        HashSet<Character> set = new HashSet<>(); // to store t values
        for(int i = 0; i < s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            if(smap.containsKey(schar)){ // check to see if s string's character has already been mapped
                if(smap.get(schar) != tchar){ // check to see if the mapping done is to the desired t string's character
                    return false;
                }
            }
            else{
                smap.put(schar, tchar);
                if(set.contains(tchar)){ // check to see if already mapping of t string is done.
                    return false;
                }
                    set.add(tchar);
                }
            }
            return true;
    }
}
