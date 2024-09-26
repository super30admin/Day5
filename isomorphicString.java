// Time Complexity - O(N) since calucating frequency of every character
// Space Complexity - O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :no
//Approach: Creating 2 hashMaps one for storing values in string s and another for storing values in string t
//We map the chars from string s to the char in string t and vice verca because by maping just one string it encounters error
//as some cases have values which are present in t but not mapped woth s


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar){
                    return false;
                }
            }
            else{
                sMap.put(sChar, tChar);
            }
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar)!= sChar){
                    return false;       
                }
            }
            else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}