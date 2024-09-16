// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> hm = new HashMap<>(); //  Creating Hashmap
        
        for(int i=0;i<s.length();i++){
            
            if(hm.containsKey(s.charAt(i))){   //Checking if  key (character s) present or not
                
                if(hm.get(s.charAt(i)) == t.charAt(i)){ // Checking if character is equal to that of t
                    
                 continue;
                }
                else
                    return false;
            }
            

            
            else{
                if(!hm.containsValue(t.charAt(i))){  //Checking if value (t character) alrady present or not. Returning false if already there
                    hm.put(s.charAt(i),t.charAt(i));
                }
                else 
                    return false;
            
           
        }
        
        
      
    }
          return true;
}
}