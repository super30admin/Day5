  
// Time Complexity : O(NM) N is th number of characters in the pattern. M is the time taken to look 
// In the HashMap for if the value is present or not.
// Space Complexity : O(1). Since there can be only 26 unique characters.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
// For each character in the pattern there must be only one unique mapping for a word in string "s".
// If the hashmap contains the character at index i and if the word at the index i is not the same
// return false.
// If the hashmap does not contain the character at index i but the word at the index i is already present
// return false.
// Else put the new character->string mapping in the hashmap.
// In the end return true.
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> hmap = new HashMap<Character,String>();
        //StringBuilder sb = new StringBuider ();
        char[] charPattern = pattern.toCharArray();
        String[] words = s.split(" ");
        
        if(charPattern.length!=words.length){
            return false;
        }
        
        for (int i=0;i<charPattern.length;i++){
            if(hmap.containsKey(charPattern[i])){
                if(!hmap.get(charPattern[i]).equals(words[i])){
                    return false;
                }
            }
            else if(hmap.containsValue(words[i])){
                return false;
            }
            hmap.put(charPattern[i],words[i]);
        }
        return true;
        
        
    }
}