// Time Complexity : O(N) as we are iterating over the strings
// Space Complexity : O(1) as 256 characters can be there at max
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

import java.util.HashMap;

public class Problem2 {

    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> pmap= new HashMap<>();
        HashMap<String, Character> smap= new HashMap<>();

        //creating an array for separate words of string s
        String[] words = s.split(" ");

        if (words.length != pattern.length()) return false;

        for(int i=0; i<pattern.length(); i++){

            //storing characters of pattern
            char pChar = pattern.charAt(i);

            //storing words of string s
            String word = words[i];

            //storing in hashmap 1
            if(!pmap.containsKey(pChar)){
                pmap.put(pChar, word);

            }else{
                if(!pmap.get(pChar).equals(word))
                    return false;
            }


            //storing in hashmap2
            if(!smap.containsKey(word)){
                smap.put(word, pChar);

            }else{
                if(!smap.get(word).equals(pChar))
                    return false;
            }
        }

        return true;

    }
}
