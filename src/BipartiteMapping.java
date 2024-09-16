/**
 * 290. Word Pattern
 * Time Complexity: O(N) where N is the length of the pattern string
 * Space Complexity: O(N)
 *
 * Leetcode submission : yes
 */
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 */
public class BipartiteMapping {
    /**
     * for each pattern character as the key, a value from the string is assigned, also keeping track of value in order to avoid any other pattern character - maping to this string
     * @param pattern
     * @param str
     * @return true if there is bipartite mapping else false
     */
        public boolean wordPattern(String pattern, String str) {
            HashMap<Character, String> hmap = new HashMap<>();        //to maintain the mapping between pattern char and a word in the string
            HashSet<String> mappedval = new HashSet<>();             //to keep track of already mapped words
            String[] strarray = str.trim().split(" ");
            if ((pattern != null && str != null) && (pattern.length() != strarray.length))
                return false;                                       // if pattern length and words in the string length r not matchg

            for (int i = 0; i < strarray.length; i++) {
                if (hmap.getOrDefault(pattern.charAt(i), null) == null) {  // if there is no mapping yet
                    if(mappedval.contains(strarray[i]))         // chk if the mapped val is already been taken, if so return false
                        return false;
                    else{
                        mappedval.add(strarray[i]);           // else add it to the map and hashset
                        hmap.put(pattern.charAt(i), strarray[i]);
                    }
                } else {                                     // if there is already a mapping, chk if it complies
                    if (!hmap.get(pattern.charAt(i)).equals(strarray[i])) {
                        System.out.println("No match");
                        return false;
                    }
                }
            }
            return true;
        }
}
