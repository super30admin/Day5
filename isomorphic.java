// Time Complexity : O(n), where n is the length of the string s and t
// Space Complexity :O(1), though we are using hashMap, but at max it will store (all uppercase and lowercase), which is constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Was a bit confused with the space complexity, please correct me if I am wrong


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //if the length of the 2 strings are not equal return false
        if(s.length() != t.length()) return false;
        
        //hashMap to store character mapping of s -> t
        HashMap<Character, Character> sMap = new HashMap<>();
        //hashMap to store character mapping of t -> s
        HashMap<Character, Character> tMap = new HashMap<>();
        
        //Compare the characters of both String "s" and String "t"
        for(int i =0; i < s.length(); i++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            
            //if character mapping of s-> t exists
            if(sMap.containsKey(sChar)){
                //AND the character mapping of "s" doesnot match to the character at string "t", return false
              if(sMap.get(sChar) != tChar){
                  return false;
              }  
            }
            else{
                //if no character mapping found, then add the mapping
                sMap.put(sChar, tChar);
            }
            
            if(tMap.containsKey(tChar)){
                //AND the character mapping of "t" doesnot match to the character at string "s", return false
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }
            else{
                //if no character mapping found, then add the mapping
                tMap.put(tChar, sChar);
            }
        }
        //If no dissimilarities found return TRUE
        return true;
    }
}