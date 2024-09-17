// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Mapping the characters to the character in the second word using hashmap



// Your code here along with comments explaining your approach

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        char[] Sstr = s.toCharArray();
        char[] Tstr = t.toCharArray();

        if(Sstr.length!= Tstr.length){
            return false;
        }

        Map<Character,Character> lookUpTable = new HashMap<>();

        for(int i=0;i<Tstr.length;i++){
            if(!lookUpTable.containsKey(Sstr[i])){
                if(lookUpTable.containsValue(Tstr[i])){
                    return false;
                }else{
                    lookUpTable.put(Sstr[i], Tstr[i]);
                }
            }else{
                if(!lookUpTable.get(Sstr[i]).equals(Tstr[i])){
                    return false;
                }
            }
        }

        return true;
    }
}
