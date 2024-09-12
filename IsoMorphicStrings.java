//time complexity: O(n). 
//space complexity: O(1)
//Solved On leetcode successfully: Yes

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) 
    {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap <Character,Character> sMap = new HashMap <Character, Character> ();
        HashMap <Character,Character> tMap = new HashMap <Character, Character> ();
        
        for (int i=0; i<s.length(); i++) {
            
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if (!sMap.containsKey(a)) {
                    sMap.put(a,b);
                }
                
                else {
                    if (!sMap.get(a).equals(b)) {
                        return false;
                    }
                }
            }
        
            for (int i=0; i<t.length(); i++) {
            
            char a = t.charAt(i);
            char b = s.charAt(i);
            
            if (!tMap.containsKey(a)) {
                    tMap.put(a,b);
                }
                
                else {
                    if (!tMap.get(a).equals(b)) {
                        return false;
                    }
                }
            }
       
        return true;
   }


}