//Problem: leetcode 290. word Pattern. 
//Problem Link: https://leetcode.com/problems/word-pattern/
// Time Complexity : O(n)
// Space Complexity :O(n*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


//Approach
/*

1. Traverse through both the strings. 
2. Store the characters of pattern(say s) in a map and its corresponding values will be the words 
at the same position in the string array(say t).
3. Step 2 for the string array words i.e store the words of string array as keys and its corresponding values will be the 
characters at the same position in the pattern.
4. compare the maps to check if it retrieves the corresponding values.
5. if either of the values from either of the map does not match, return false.

*/

class Problem3 {
    public boolean wordPattern(String pattern, String str) {
        
        String[] strs = str.split(" ");
        if(strs.length != pattern.length()){
            return false;
        }
        HashMap<Character, String> cmap = new HashMap<Character, String>();
        HashMap<String, Character> smap = new HashMap<String, Character>();
        
        for(int i=0;i<strs.length;i++){
            char ch = pattern.charAt(i);
            if(!cmap.containsKey(ch)){
                cmap.put(ch, strs[i]);
            }
            
            if(!smap.containsKey(strs[i])){
                smap.put(strs[i], ch);
            }
            
            if((!cmap.get(ch).equals(strs[i])) || (!smap.get(strs[i]).equals(ch))){
                return false;
            }
        }
        return true;
    }
}