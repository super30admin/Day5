// Time Complexity : O(N) goes through array linearly
// Space Complexity :O(2N) for two Hashmaps created. Since constants are not considered consider it as O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> smap = new HashMap<>();        
                Map<Character,Character> tmap = new HashMap<>(); 
        for(int i=0;i<s.length();i++){
               
            if(!smap.containsKey(s.charAt(i))) // Store isomorphic pairs of s characters with t
            smap.put(s.charAt(i),t.charAt(i));   
            
            if(!tmap.containsKey(t.charAt(i)))
                tmap.put(t.charAt(i), s.charAt(i)); // Store isomorphic pairs of t characters with s
        }
        
        
        for(int i=0;i<s.length();i++){
            
            char a=smap.get(s.charAt(i));    
            char b=tmap.get(t.charAt(i));
            if(t.charAt(i)!=a || s.charAt(i)!=b)  // check if either each element of s array is isomorphic with t and viceversa. If any one is false then you return false;
                return false;
              
            }
        
        return true;
    }
}