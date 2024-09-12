// Time Complexity : O(mk) + o(nk) where nk is for splitting and mk is for iterating over the pattern and equals()
// Space Complexity : O(nk) where n is the number of Strings in the string array and k is the average length of each string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        
        if(pattern.length() != strArray.length){
            return false;
        }
        
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++){
            char pChar = pattern.charAt(i);
            String str = strArray[i];
            
            if(pMap.containsKey(pChar)){
                if(!pMap.get(pChar).equals(str)){
                    // There is a mapping already with a different string
                    return false;
                }
            }
            else{
                pMap.put(pChar, str);
            }
            
            if(sMap.containsKey(str)){
                if(sMap.get(str) != pChar){
                    return false;
                }
            }
            else{
                sMap.put(str, pChar);
            }
        }
        
        return true;
    }
}