import java.util.HashMap;
import java.util.HashSet;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //if both are null then it is isomorphic
       if(s==null && t==null) 
           return true;
        //if both the strings are of different length then it is not isomorphic
        if(s.length()!= t.length())
            return false;
        //mapping first string characters to second string characters
        HashMap<Character,Character> smap = new HashMap<>();
        //putting the second string characters to set
        HashSet<Character> set = new HashSet<Character> (); 
        for(int i=0; i<s.length(); i++){
            if(smap.containsKey(s.charAt(i))){
                //if the value in the map matches the currrent value
                if(t.charAt(i)!= smap.get(s.charAt(i))){
                    return false;
                }
            }
            else{
                //add in map
            smap.put(s.charAt(i),t.charAt(i));
                //if set conatins the character in second string,
                //but the first string character is not in map
                //then it is not isomorphic
            if(set.contains(t.charAt(i))){
                return false;
            }
                    set.add(t.charAt(i));
                }
        }
        return true;
    }
}