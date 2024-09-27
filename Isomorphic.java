// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No

import java.util.HashMap;
import java.util.HashSet;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map= new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            //if the schar is already present in the map then check further
            if(map.containsKey(schar)){
                //if it does not match the char in t array then return false else it means that there is correct mapping
                if(!map.get(schar).equals(tchar)){
                    return false;
                }
                
            }else{
                //if the map does not contain a mapping but the set does contain then it means that there is a wrong mapping entry
                if(set.contains(tchar)){
                    return false;
                }
                //if mapping is not present in map add it to map and set
                map.put(schar,tchar);
                set.add(tchar);
            }
        }
        return true;
    }
}