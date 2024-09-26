// Time Complexity : O(n)  
// Space Complexity : O(1) to store the triplets(LinkedList)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //edge case
        if(s.length() != t.length()) return false;
        
        //creating hashmaps for both strings
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i=0; i< s.length(); i++){
            
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            //check if string s contains a character
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, tChar);
            } else{
                
                //get character from sMap which was earlier mapped and it should be equal to t character
                if(sMap.get(sChar) != tChar) return false;
            }
            
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar, sChar);
            } else{
                
               
                if(tMap.get(tChar) != sChar) return false;
            }
            
        }

        return true;
    }
}