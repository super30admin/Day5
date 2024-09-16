//Time complexity: O(N)
//Space Complexity O(1) extra hashmaps will be only storing mapping for 26 charcaters so need to count them as it is a very small constant
//Leetcode : Yes.

import java.util.HashMap;
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map_s = new HashMap<Character, Character>();
        HashMap<Character, Character> map_t = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            //check if the character is present in first hashmap then it should be equal to the value in the 2nd or vice versa.
            //if not then its not isomorphic
            //Need to take individual characters in a variable so the condition becomes easily readable
            if (map_s.containsKey(s.charAt(i))) {
                if (map_t.get(t.charAt(i)) == null || !((map_t.get(t.charAt(i))).equals(s.charAt(i)))) {
                    return false;
                }
            } else if (map_t.containsKey(t.charAt(i))) {
                if (map_s.get(s.charAt(i)) == null || !((map_s.get(s.charAt(i))).equals(t.charAt(i)))) {
                    return false;
                }
            }else {
                //if the key is never present we are looking at this charcater first time, just add it in both the HashMap.
                map_s.put(s.charAt(i), t.charAt(i));
                map_t.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }

}
