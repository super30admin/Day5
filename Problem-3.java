class Solution {
    
    // Time Complexity : O(n) where n is the length of the pattern
    // Space Complexity : O(n) where n is the number of words in hash table
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : Nope
    public boolean wordPattern(String pattern, String str) {
        
        Map <Character,String> map = new HashMap<>();
        String[] strArray = str.split(" ");
        char[] patternArray = pattern.toCharArray();
        int n = pattern.length();
        if (patternArray.length != satrArray.length) return false;
        for(int i = 0; i < n; i++) {
            //check if map already contains the key and it matches
            if(map.containsKey(patternArray[i])) {   
                if(!map.get(patternArray[i]).equals(strArray[i]))
                    return false;
            }
            //check if map already exists ( bijection prroperty)
            else {
                if(!map.containsValue(strArray[i])) {
                map.put(patternArray[i],strArray[i]);
                }
                else
                    return false;
            }
            
        }
        return true;
    }
}
