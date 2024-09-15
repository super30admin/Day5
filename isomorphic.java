class Solution {
    //TC:O(n),SC:O(n)
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> sMap=new HashMap<>();
        
        HashMap<Character,Character> tMap=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
           char sChar=s.charAt(i);
           char tChar=t.charAt(i);
            if(sMap.get(sChar)!=null)
                {
                if(sMap.get(sChar)!=tChar)
                    return false;
                }
             else sMap.put(sChar,tChar);
        
                    
            if(tMap.get(tChar)!=null)
            {
                if(tMap.get(tChar)!=sChar)  
                    return false;
            }
            else
                    tMap.put(tChar,sChar);
        }
        return true;
    }
}
