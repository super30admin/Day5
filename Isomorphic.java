class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> sToT = new HashMap<Character,Character>();
        HashMap<Character,Character> tToS = new HashMap<Character,Character>();
        
        if(s.isEmpty() || t.isEmpty()) return false;
        
        for(int i=0;i<s.length();i++)
        {
            char cs =s.charAt(i);
            char ct =t.charAt(i);
            
            
          if(sToT.containsKey(cs)  && sToT.get(cs)!=ct)
          {
              return false;
          }
            else
            {
                sToT.put(cs,ct);
            }
            if(tToS.containsKey(ct)  && tToS.get(ct)!=cs)
            {
                return false;
            }
            else
            {
                tToS.put(ct,cs);
            }
            
        }
return true;
    
    }
}