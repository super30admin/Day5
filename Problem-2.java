import java.util.HashMap;

class Solution {

    // here we taken 2 hashmaps where each character of string s will be key and each charcter from t will be corresponding value Vice-versa
    // after mapping is done we check each val of key in hashmap s to character value in t if it doesn't match return false;
    // Time Complexity  : O(n) space Complexity:O(n)
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hms = new HashMap<Character,Character>();
        HashMap<Character,Character> hmt = new HashMap<Character,Character>(); 
        if(s.length() != t.length())
        {
            return false;
        }
        
       for(int i =0; i < s.length();i++){
           
               if(hmt.containsKey(t.charAt(i))){
                    continue;
                }
            
            else
            {
                hmt.put(t.charAt(i),s.charAt(i));
            }
            
        }
        for(int i =0; i < s.length();i++){
           
               if(hms.containsKey(s.charAt(i))){
                    continue;
                }
            
            else
            {
                hms.put(s.charAt(i),t.charAt(i));
            }
            
        }
       if(hms.size() != hmt.size())
       {
           return false;
       }
   
        for(int i =0; i < s.length();i++)
        {
            
            if(hms.get(s.charAt(i)) == t.charAt(i) )
                {
                    continue;
                }
               
                
                else{
                    return false;
                }
            
            
            
        }
        
         
return true;
}}