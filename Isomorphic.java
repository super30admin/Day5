/*
TC - O(n)
SC - O(1)

*/
class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar)){
                if(tChar != sMap.get(sChar)) return false;
            }
            
            if(tMap.containsKey(tChar)){
                if(sChar != tMap.get(tChar)) return false;
            }
            
            sMap.put(sChar,tChar);
            tMap.put(tChar,sChar);
        }
        return true;
        
    }
}