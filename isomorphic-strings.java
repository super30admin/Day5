// Time Complexity :O(1) 
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        HashSet<Character> hs=new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            char k=s.charAt(i);
            char v=t.charAt(i);
             if(hs.contains(v) && !map.containsKey(k))
            {
               return false;
            }
            if(!map.containsKey(k))
            {
                map.putIfAbsent(k,v);
                hs.add(v);
            }
            if(map.containsKey(k) && map.get(k)!=v)
                return false;
          
           }
           
               
            
                
        
        return true;
        
    }
}