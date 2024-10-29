//205. Isomorphic Strings - https://leetcode.com/problems/isomorphic-strings/description/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge case
        if(s.length() != t.length()){
            return false;
        }
        //create 2 HashMaps to store each String
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //sMap
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }
            //tMap
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            } else {
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}

