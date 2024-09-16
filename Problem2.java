Time Complexity: O(n). n is length of string s or t.
Space Complexity: O(n). We will have 2n entries in the HashMap but we can ignore constant.


class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        char sChar, tChar;
        
        for(int i = 0; i < s.length(); i++){
            
            sChar = s.charAt(i);
            tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar)) {
                if(!(tChar == sMap.get(sChar))) {
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }
            
            if(tMap.containsKey(tChar)) {
                if(!(sChar == tMap.get(tChar))) {
                    return false;
                }
            } else {
                tMap.put(tChar, sChar);
            }
            
        }
        
        return true;
        
    }
}
