// Time Complexity : O(N) goes through array linearly
// Space Complexity :O(N) for Hashmap created. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character,String> hmap = new HashMap<>();
         Map<String,Character> wordmap = new HashMap<>();
        
        String arr[]=s.split(" ");
        
      if(arr.length!=pattern.length()) return false; // if lengths dont match return false
        
        for(int i=0;i<pattern.length();i++){     
            
            if(hmap.containsKey(pattern.charAt(i))){       // create hashmap of key pattern and value word in a string
                
                if(!arr[i].equals(hmap.get(pattern.charAt(i))))
                     return false;
                
            }
            
            else{
                
                hmap.put(pattern.charAt(i),arr[i]);
            }
            
            if(wordmap.containsKey(arr[i])){
                if(pattern.charAt(i)!=Character.valueOf(wordmap.get(arr[i]))) // Check if every pattern and word has same mapping from hashmap if exists
                    
                    return false;   //else return false;
            }
               
               else{
                   
                   wordmap.put(arr[i],pattern.charAt(i)); // if no pattern was found start adding into the map
               }
                    
            
            
        }
        
        return true;
        
    }
}