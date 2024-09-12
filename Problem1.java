// Time Complexity : O(N) as we are iterating over the strings
// Space Complexity : O(1) as 256 characters can be there at max
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

/*

We had two strings, first we are comparing both the strings whether they are of the same length or not. Then, we are creating two
different hashmaps for storing key, value pairs of our two given strings

 */

import java.util.HashMap;

public class Problem1 {

    public boolean isIsomorphic(String s, String t) {

        if(s.length()!= t.length()) return false;

        //creating two maps for both the strings
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for(int i=0; i<s.length(); i++){

            //getting characters of both the strings

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);


            if(smap.containsKey(sChar)){
                if(smap.get(sChar) != tChar) return false;

            }else{
                smap.put(sChar,tChar);
            }

            if(tmap.containsKey(tChar)){
                if(tmap.get(tChar) != sChar) return false;

            }else{
                tmap.put(tChar,sChar);
            }
        }
        return true;
    }
}
