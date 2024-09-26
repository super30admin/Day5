//Time Complexity: O(N) 
//Space Complexity: O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            }
            
            if(!tMap.containsKey(tChar)) {
                tMap.put(tChar, sChar);
            }
            
            if(sMap.get(sChar) != tChar || tMap.get(tChar) != sChar)
                return false;
        }
        return true;        
    }
}