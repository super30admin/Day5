package leetcode;

import java.util.HashMap;
import java.util.HashSet;
//Time Complexity : O(1)
// Space complexity  : O(1)



class Faang13 {
    public boolean isIsomorphic(String s, String t) {
        String[] words=s.split("\\s");
        if(s.length() != t.length() ) return false;
        HashMap<Character,Character> smap =new HashMap<>();
        HashSet<Character> mset = new HashSet<>();
        for(int i =0; i < s.length();i++){
            if(!smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i),t.charAt(i));
                if(!mset.contains(t.charAt(i))){
                    mset.add(t.charAt(i));
                }else return false;
            }else{
                if(smap.get(s.charAt(i)) != t.charAt(i))return false;
            }

        }return true;
    }
}