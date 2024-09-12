// Time Complexity :O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: Have to understand difference between bijection and isomorphism. 

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String,Character> existingPairs = new HashMap<>();
        if(words.length != pattern.length()){
            return false;
        }
        for(int i = 0 ; i < pattern.length(); i++){
            char currChar = pattern.charAt(i);
            String currStr = words[i];
            if(map.containsKey(currChar)){
                if(!map.get(currChar).equals(currStr)) return false; 
            }else{
                if(existingPairs.containsKey(currStr)){
                    char storedPair = existingPairs.get(currStr);
                    if(storedPair != currChar) return false;
                }else{
                    map.put(currChar, currStr);
                    existingPairs.put(currStr, currChar);
                }
            }
        }
        return true;
    }
}