// Time Complexity : O(N^2) because of containsValue() method
// Space Complexity : O(N + K) //for hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

class Solution {

    public boolean wordPattern(String pattern, String s) {
        //split s into an array of strings
        String[] words = s.split(" ");       
        
        //if pattern does not have as many chars as there are words then it def fails
        if(pattern.length() != words.length)
            return false;

        HashMap<Character, String> map = new HashMap<Character, String>(); 
        
        //we iterate through all the words
        for(int i = 0; i < words.length; i++){
            //holds the first char of the pattern
            char c = pattern.charAt(i);
            //if the char already exists
            if(map.containsKey(c)){
                //if the key exists with a diff value
                if(!map.get(c).equals(words[i]))
                    return false;
            //char does not exist on map yet
            else
                //the value exists but with a diff key
                if(map.containsValue(words[i]))
                    return false;
                //value does not exist yet either so we put the pair on the map
                map.put(c, words[i]);
            }
        }
        return true;
    }
}