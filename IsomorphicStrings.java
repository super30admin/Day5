/*
 *  Time Complexity: O(N) where N is the number characters in the string.
 *  Space Complexity: O(1) Since the number of character is constant
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 *
 *  Create two hashmaps and store the mapping for all the characters from string s to string t and vice-versa. Return false if there is any new mapping that is different from the previous mapping.
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(smap.containsKey(sChar)){
                if(smap.get(sChar)!=tChar) return false;
            }else{
                smap.put(sChar, tChar);
            }
            if(tmap.containsKey(tChar)){
                if(tmap.get(tChar)!=sChar) return false;
            }else{
                tmap.put(tChar, sChar);
            }
        }
        return true;
    }
}
