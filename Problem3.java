// Time Complexity : O (s)
// Space Complexity : O (s)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;
import java.util.HashSet;

public class Problem3{
    public boolean wordPattern(String pattern, String s) {
        
        String[] str=s.split(" ");
          if(str.length != pattern.length())return false;


        // Have  HashMaps to create Mapping. Check at reentry whether new value ==old value and value in set
        HashMap<String, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        for(int i = 0; i < str.length;i++){
            String curr = str[i];
            char tChar = pattern.charAt(i);
            if(sMap.containsKey(curr) == false){
                if(tSet.contains(tChar))return false;
                else{
                    sMap.put(curr, tChar);
                    tSet.add(tChar);
                }
            }else{
                if(sMap.get(curr) != tChar)return false;
            }
        }
        return true;
        
    }
}