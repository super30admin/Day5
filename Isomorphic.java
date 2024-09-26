/**
s = "egg", t = "add"

Time Complexity - O(n) where n is the length of an input string.
Space Complexity - O(1) since the size of valid ascill characters are 25. 

**/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length())
        {
            return false;
        }
        
        
        final Map<Character, Character> sToTMap = new HashMap<>();
        final Map<Character, Character> tToSMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (sToTMap.containsKey(sChar))
            {
                char mappedValue = sToTMap.get(sChar);
                
                if (mappedValue != tChar)
                {
                    return false;
                }
            }
            else
            {
                sToTMap.put(sChar, tChar);
            }
            
            if (tToSMap.containsKey(tChar))
            {
                if (tToSMap.get(tChar) != sChar)
                {
                        return false;
                }
            }
            else
            {
                tToSMap.put(tChar, sChar);
            }
        }
        
        return true;
    }
}