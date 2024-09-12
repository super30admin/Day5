import java.util.*;

// Time Complexity : O(N), where N = length of string pattern / no of words in string s
// Space Complexity : 
//      cmap at max has 26 characters - O(1)
//      smap at max has all the unique strings in s - O(M), M - unique number of strings in s.
//
//      SC = O(M)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        
        if(strs == null || strs.length != pattern.length()){
            return false;
        }
        HashMap<Character, String> cmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();
        
        for(int i = 0; i<strs.length; i++){
            char ch = pattern.charAt(i);
            String str = strs[i];
            
            if(!cmap.containsKey(ch)){
                cmap.put(ch, str);
            }
            else{
                if(!cmap.get(ch).equals(str)){
                    System.out.println("Returns this");
                    return false;
                }
            }
            if(!smap.containsKey(str)){
                smap.put(str, ch);
            }
            else{
                if(!smap.get(str).equals(ch)){
                    return false;
                }
            }
        }        
        return true;
    }
}