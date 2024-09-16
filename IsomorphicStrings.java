//Time Complexity: O(n)
//Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false; // return false if both are of not equal length
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!map.containsKey(sChar)) { //check if map contains the char mapping
                if(set.contains(tChar)) return false; // if no check if the set contains the char if yes return false
                map.put(sChar, tChar);  // add the mapping to the map
                set.add(tChar); // add the tchar to set
            }
            else {
                if(map.get(sChar) != tChar) {
                    return false; // if map already contains check if the tcahr and schar and return false accordingly
                }
            }
        }
        return true;
    }
}
