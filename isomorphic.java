// Time Complexity:O(n), space complexity:O(1)

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<Character>();
        
        for(int i= 0;i<s.length();i++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if(smap.containsKey(sChar)){
                if(smap.get(sChar)!=tChar){
                    return false;
                }
            }else{
                if(tset.contains(tChar)){
                    return false;
                }
                smap.put(sChar,tChar);
                tset.add(tChar);
            }
        }
        return true;
    }
}