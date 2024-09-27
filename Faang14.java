package leetcode;

import java.util.HashMap;
import java.util.HashSet;

//Time Complexity : O(1)
// Space complexity  : O(1)

class Faang14 {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split("\\s");
        if(words.length != pattern.length() ) return false;
        HashMap<Character,String> smap =new HashMap<>();
        HashSet<String> mset = new HashSet<>();
        for(int i =0; i < pattern.length();i++){
            if(!smap.containsKey(pattern.charAt(i))){
                smap.put(pattern.charAt(i),words[i]);
                if(!mset.contains(words[i])){
                    mset.add(words[i]);
                }else return false;
            }else{
                if(!smap.get(pattern.charAt(i)).equals(words[i]))return false;
            }
        }return true;
    }


}