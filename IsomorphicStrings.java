// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : coding the logic for reverse mapping


import java.util.*;
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        // create maps to store mappings and reverse mappings
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++) {

            char currCharS = s.charAt(i);
            char currCharT = t.charAt(i);

            // if the character in 's' is already mapped
            if(map1.containsKey(currCharS)) {

                // if the saved value for the character in 's' is different from the current corresponding character in 't', return false
                if(map1.get(currCharS) != currCharT) {
                    return false;
                }
            } else {

                // if the character in 's' is not saved, but the current corresponding character in 't' is already mapped to some other character, return false
                if(map2.containsKey(currCharT)) {
                    return false;
                }

                // save the mapping and reverse mapping
                map1.put(currCharS, currCharT);
                map2.put(currCharT, currCharS);
            }
        }

        return true;
        
    }
}