// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public boolean wordPattern(String s, String ot) {
        String[] t= ot.split(" ");
        
        if(s.length()!=t.length)
            return false;
        
        HashMap<Character,String> map=new HashMap<Character,String>();
        HashSet<String> hs=new HashSet<String>();
        
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            String v=t[i];
            if(hs.contains(v) && !map.containsKey(k))
            {
               return false;
            }
            if(!map.containsKey(k))
            {
                map.putIfAbsent(k,v);
                hs.add(v);
            }
            if(map.containsKey(k) && map.get(k).compareTo(v)!=0)
                return false;
          
        }
               
        return true;
    }
   
}