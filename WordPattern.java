import java.util.HashMap;

// Time Complexity : O(N) where N is the number of characters
// Space Complexity : O(N), since we store the list of strings after splitting s
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.

// Your code here along with comments explaining your approach
/*
1. Use HashMap to store pattern char : string mapping and string: pattern char mapping. If not 1:1 mapping return false
* */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length()*s.length()==0) return false;

        String[] strs=s.split(" ");
        if(strs.length!=pattern.length()) return false;

        HashMap<Character, String> pmap= new HashMap<>();
        HashMap<String, Character> smap= new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            if(!pmap.containsKey(pattern.charAt(i))){
                pmap.put(pattern.charAt(i),strs[i]);
            }else{
                if(!strs[i].equals(pmap.get(pattern.charAt(i)))) return false;
            }

            if(!smap.containsKey(strs[i])){
                smap.put(strs[i],pattern.charAt(i));
            }else{
                if(pattern.charAt(i)!=smap.get(strs[i])) return false;
            }
        }


        return true;
    }
}
