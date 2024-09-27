/*
  Time Complexity :- O(N)
  Space Complexity :- O(N)
  Approach :- Create 2 hashmaps for character mapping of S to T and T to S. Compare the characters     one by one in hashmap...and if the character has already mapped to a different character, return     false
*/
class IsoMorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        
        if(s.length()!=t.length())
            return false;
        
        for(int i=0;i<s.length();i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar) && sMap.get(sChar)!=tChar)
                return false;
            else
                sMap.put(sChar,tChar);
            
            if(tMap.containsKey(tChar) && tMap.get(tChar)!=sChar)
                return false;
            else
                tMap.put(tChar,sChar); 
        }
        return true;
    }
}
