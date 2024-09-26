class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        // no two characters may map to the same character; this indicates the need for two hashmaps or 
        // a hashmap and a hashset eg. of eggn and addd
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            }
            else {
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            }
            if(!tMap.containsKey(tChar)) {
                tMap.put(tChar, sChar);
            }
            else {
                if(tMap.get(tChar) != sChar) {
                    return false;
                }
            }
        }
        return true;
    
    }
}