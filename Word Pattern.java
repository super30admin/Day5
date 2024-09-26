// Time Complexity : O(n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        // convert Pattern and String into character array
        char [] pArray = pattern.toCharArray();
        String [] splitString = s.split(" ");
        
        // return false if length of Pattern and String array is unequal
        if(pArray.length != splitString.length) return false;
        
        // Two Hash Maps to store mapping from Pattern to String and vice versa
        HashMap<Character,String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        
        for(int i = 0; i < pArray.length; i++){
            
            // get character from each index of pattern array
            char pChar = pArray[i];

            // get string from each index of string array
            String sString = splitString[i];
            

            // Pattern to String mapping
            if(pMap.containsKey(pChar)){
                // if pattern already exists in the hash map and is not mapped to the same word, then return false
                if(!pMap.get(pChar).equals(sString)) return false;
            }else{
                // if pattern does not exist in the hash map, then add pattern and corresponding string to the hash map
                pMap.put(pChar, sString);
            }
            

            // String to Pattern mapping
            if(sMap.containsKey(sString)){
                // if string already exists in the hash map and is not mapped to the same pattern, then return false
                if(sMap.get(sString) != pChar) return false;
            }else{
                // if word does not exist in the hash map, then add the string and corresponding pattern to hashmap
                sMap.put(sString, pChar);
            }
        }
        
        return true;
    } 
        
}