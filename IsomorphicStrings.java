/*
* Time complexity - O(N) - linear scan of String array is done 
 Space Complexity - O(N) - using a hashmap as auxiliary data structure
 Ran on Leetcode 
*/



class Solution {
   public boolean isIsomorphic(String s, String t) {
       
       Map<Character, Integer> mapS = new HashMap<Character, Integer>();
       Map<Character, Integer> mapT = new HashMap<Character, Integer>();
       
       for (int i = 0 ; i < s.length() ; i++){
           int S = mapS.getOrDefault(s.charAt(i), -1);
           int T = mapT.getOrDefault(t.charAt(i), -1);
           
           if (S != T){
               return false;
           }
           mapS.put(s.charAt(i), i );
           mapT.put(t.charAt(i), i );
       }
        
       return true;
       
    }
}