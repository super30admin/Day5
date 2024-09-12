class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            
            if(!map.containsKey(sc))
            {
                map.put(sc,tc);
            }
            else
            {
                if(map.get(sc)!=tc)
                {
                    return false;
                }
            }
            
            if(!map1.containsKey(tc))
            {
                map1.put(tc,sc);
            }
            else
            {
                if(map1.get(tc)!=sc)
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}