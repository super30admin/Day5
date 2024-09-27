/* One HashMap, One HashSet Solution
 * Time Complexity: O(n), where n is the length of string
 * Space Complexity:O(1), since we have only 26 character in english
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(map.containsKey(sChar)){
                if(map.get(sChar) != tChar) return false;
            } else {
                if(set.contains(tChar)) return false;
                map.put(sChar, tChar);
                set.add(tChar);
            }
        }
        return true;
    }
}
