//time complexity : O(n)
//space complexity: O(n)


class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        //the logic is to store the char to string mapping and vice versa in 2 hashmaps. if the mapping isnt present we store
        //it, if same key-value pair isnt there, return false
        String[] words= s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> rmap = new HashMap<>();
        
        if(pattern.length() != words.length)return false; 
        
        for(int i=0;i<pattern.length(); i++)
        {
            String str= words[i];
            char key = pattern.charAt(i);
           
             if(map.containsKey(key) && !map.get(key).equals(str)){
                 return false;
            } 
            map.put(key, str); 
            
            if(rmap.containsKey(str)&&rmap.get(str)!=key){
                return false;
            } 
            rmap.put(str, key);
       }
       return true; 
  
            
    }
}        
              
        