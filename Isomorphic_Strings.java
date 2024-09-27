//Time complexity: o(n)
//Space complexity: o(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
            
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i=0;i< s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
         // s to t isomorphic (mapping)
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, tChar);
            } else{
                if(sMap.get(sChar) != tChar) return false;
            }
        
        // t to s isomorphic (mapping)
             if(!tMap.containsKey(tChar)){
                tMap.put(tChar, sChar);
            } else{
                if(tMap.get(tChar) != sChar) return false;
            }
        }
        return true;
    }
}

//Faster Solution

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // HashMap<Character, Character> sCharmap = new HashMap<>();
        // HashMap<Character, Character> tCharmap= new HashMap<>();
        
        char [] sMap = new char[100];
        char [] tMap = new char[100];
        
        for(int i = 0; i < s.length(); i++){
            
            char sChar  = s.charAt(i);
            char tChar  = t.charAt(i);
            
            
            if(sMap[sChar - ' '] == 0){
                sMap[sChar - ' '] = tChar;
                
            }else if(sMap[sChar - ' '] != tChar) return false;
            
            if(tMap[tChar - ' '] == 0){
                tMap[tChar - ' '] = sChar;
                
            }else if(tMap[tChar - ' '] != sChar) return false;
            
        }
        
        return true;
        
    }
}
