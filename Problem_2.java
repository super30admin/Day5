class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        Map<Character, Character> charMap = new HashMap<Character, Character>();
        Map<Character, Character> charMap_2 = new HashMap<Character, Character>();
        
        for(int i=0; i < s.length(); i++){
            
            if(!charMap.containsKey(s.charAt(i))){
                charMap.put(s.charAt(i), t.charAt(i));
            }else if(charMap.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            
            if(!charMap_2.containsKey(t.charAt(i))){
                charMap_2.put(t.charAt(i), s.charAt(i));
            }else if(charMap_2.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
        }
        
        return true;
    }
}