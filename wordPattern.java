// Time Complexity : O(nk) k= avg length of a string  
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        if(pattern.length()!=str.length) return false;
        HashMap<Character,String> hmap= new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String p=str[i];
            if(hmap.containsKey(c)){
                if(!hmap.get(c).equals(p)){
                    return false;
                }
            }else{
                if(set.contains(p)){
                    return false;
                }
                hmap.put(c,p);
                set.add(p);
            }
        }
          return true;  
    }
}