// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

//check if strings are ismorphic
// Your code here along with comments explaining your approach


class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> StoTmap=new HashMap<>();
        Set<Character> tSet=new HashSet<>();
        
        for(int i=0;i<s.length();++i){
            
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            
            if(StoTmap.containsKey(sChar)){
                
                char mappedchar=StoTmap.get(sChar);
                if(mappedchar!=tChar){
                    
                    return false;
                }
                
            } else{
                
               if(tSet.contains(tChar)){
                   
                   return false;
               }
                StoTmap.put(sChar,tChar);
                tSet.add(tChar);
                }
        }
     return true;    
    }
}
