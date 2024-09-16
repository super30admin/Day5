/**
 * 205. Isomorphic Strings
 * Time Complexity: O(N) where N is the length of the input String
 * Space Complexity: O(N)
 *
 * Leetcode submission : yes
 */

import java.util.HashMap;
import java.util.HashSet;

/**
 * init. chk for the length of the 2 strings and then each mapped val is stored in hashset to preserve Bipartite mapping
 * chk whether each mapping is same or if it differs or fails 1:1 mapping the return false
 */
public class IsomorphicCharMatch {
    /**
     * init. chk for the length of the 2 strings and then each mapped val is stored in hashset to preserve Bipartite mapping
     * chk whether each mapping is same or if it differs or fails 1:1 mapping the return false
     * @param s
     * @param t
     * @return true if mapping is isomorphic else false
     */
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> hmap = new HashMap<>();       //to maintain the mappings
            HashSet<Character> mappedval = new HashSet<>();             // to preserve 1:1 mapping
            if ((s != null && t != null) && (s.length() != t.length())) //if the lengths are not equal the return false
                return false;
            for (int i = 0; i < s.length(); i++) {
                if (hmap.getOrDefault(s.charAt(i), null) == null) { // if char in s is not mapped
                    if (mappedval.contains(t.charAt(i)))                       // chk if its already been mapped by some other char
                        return false;
                    else {
                        mappedval.add(t.charAt(i));                            // add to the mappedval haset
                        hmap.put(s.charAt(i), t.charAt(i));                     //add to the map
                    }
                } else {
                    if (hmap.get(s.charAt(i)) != t.charAt(i)) {                 // is mapping already exits and is not followed by this char then return false
                        //System.out.println("No match");
                        return false;
                    }
                }
            }
            return true;
        }
}
