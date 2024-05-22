// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// save key as a charecter from pattern and value as a string from from s in one hash map.
// Do opposite key as a strings from s and value as a charecters from pattern.
// rerun false while looping if any of the hashmap key does not match value

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String strs[] = s.split(" ");
        if(pattern.length() != strs.length){
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> strMap = new HashMap<>();

        for (Integer i=0; i< pattern.length(); i++){
            char patternChar = pattern.charAt(i);
            String str = strs[i];
            
            // First hash map
            if(patternMap.containsKey(patternChar)){
                if(!patternMap.get(patternChar).equals(str)){
                    return false;
                }
            }
            else{
                patternMap.put(patternChar, str);
            }

            // second hash map
            if(strMap.containsKey(str)){
                if(strMap.get(str) != patternChar){
                    return false;
                }
            }
            else{
                strMap.put(str, patternChar);
            }
        }
        return true;
    }
}