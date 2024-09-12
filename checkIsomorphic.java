class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s==null || t== null || s.length()!=t.length())
        {
            return false;
        }
        
        Map<Character, Character> sString = new HashMap<>();
        Map<Character, Character> tString = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char s2 = s.charAt(i);
            char t2 = t.charAt(i);
            if(!sString.containsKey(s2))
               {
                   sString.put(s2, t2);
               }
            if(!tString.containsKey(t2))
               {
                tString.put(t2, s2);
               }
            if(sString.get(s2)!=t2 || tString.get(t2)!=s2)
               {
                   return false;
               }
        }
    
               return true; 
        
    }
}
//runtime: O(n)
//spacecomplexity: O(1)- because the max size that can be stored is 256(ascii) and not more than that 
