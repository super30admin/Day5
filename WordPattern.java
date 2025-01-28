/*
Time Complexity: O(N+M) where N represents the length of s and M represents the length of pattern
Space Complexity:O(N)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
 */

// Your code here along with comments explaining your approach
/*
Add key and value to the map
key can be the word or character, value is their index position
if the indices of the word and character dont match return false,
that means there is no unique mapping between word and character
 */

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap mapIndex=new HashMap<>();
        String[] words=s.split(" ");

        if(pattern.length()!=words.length)
            return false;

        for(Integer i=0;i<words.length;i++){
            char c=pattern.charAt(i);
            String word=words[i];

            if(!mapIndex.containsKey(c)){
                mapIndex.put(c,i);
            }

            if(!mapIndex.containsKey(word)){
                mapIndex.put(word,i);
            }

            if (mapIndex.get(c) != mapIndex.get(word))
                return false;

        }

        return true;
    }
}
