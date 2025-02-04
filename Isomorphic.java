class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Character> sMap = new HashMap<Character, Character>();
        HashMap<Character, Character> tMap = new HashMap<Character, Character>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.get(sChar) == null){
                if(tMap.get(tChar) != null) return false;
               sMap.put(sChar, tChar);
               tMap.put(tChar, sChar);
            }
            else if(sMap.get(sChar) != tChar 
            || tMap.get(tChar) != sChar){
               return false;
            }
        }
               return true;
        
    }
}