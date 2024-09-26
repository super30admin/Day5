package code;
//time complexity: O(n) 
//space complexity: O(1) 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())return false; //if they aren't equal in length then they arent isomorphic
       // if(s.length() == t.length())
        {
        	//creating 2 hashmaps to store s->t and t->s mapping
        	//if the char exists in s map get the corresponding value of that key and check if it exists in
        	//t if yes return false, if not add it in the smap. same logic for t->s mapping as well. 
        	
            HashMap<Character, Character> sMap = new HashMap<>();
            HashMap<Character, Character> tMap = new HashMap<>();
            
            for(int i=0; i<s.length(); i++)
            {
                Character sChar = s.charAt(i);
                Character tChar = t.charAt(i); 
                if(sMap.containsKey(sChar)){
                    if(sMap.get(sChar) != tChar) return false; 
                 }
                else {
                    sMap.put(sChar, tChar);
                }
                
                if(tMap.containsKey(tChar)){
                    if(tMap.get(tChar) != sChar) return false;
                }
                else {
                    tMap.put(tChar, sChar);
                }
            }
            
            
        }
        return true;
    }
}