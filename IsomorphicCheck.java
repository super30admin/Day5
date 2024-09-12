/*
Time Complexity - O(n)
Space Complexity - O(n)
*/

class IsomorphicCheck {
    public boolean isIsomorphic(String s, String t) {
      
        
        Map<Character,Character> sMap = new HashMap<Character, Character>();
         Map<Character,Character> tMap = new HashMap<Character, Character>();
        
        for(int i=0;i<s.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar) && sMap.get(sChar)!=tChar) return false;
            sMap.put(sChar,tChar);
            if(tMap.containsKey(tChar) && tMap.get(tChar)!=sChar) return false;
            tMap.put(tChar,sChar);
        }
        return true;
    }
}
