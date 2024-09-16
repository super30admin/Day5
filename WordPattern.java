import java.util.HashMap;
import java.util.Map;

// Time Complexity :O(n) where n is the length of string
// Space Complexity : O(m+n)
// Did this code successfully run on Leetcode : Yes
//https://leetcode.com/problems/word-pattern/
// Any problem you faced while coding this : No
// Approach: maintained two hash maps for mapping pattern to String and vice versa, Checked both the maps for correctness
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> m1 = new HashMap<>();
        Map<String, Character> m2 = new HashMap<>();
        String[] ss = s.split(" ");
        if (pattern.length() != ss.length) return false;
        for(int i = 0; i < pattern.length(); i++) {
            if (!m1.containsKey(pattern.charAt(i)) && !m2.containsKey(ss[i])) {
                m1.put(pattern.charAt(i), ss[i]);
                m2.put(ss[i], pattern.charAt(i));
            } else if ((m1.containsKey(pattern.charAt(i)) && !m1.get(pattern.charAt(i)).equals(ss[i])) ||
                    (m2.containsKey(ss[i]) && m2.get(ss[i]) != pattern.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       String pattern = "abba", s = "dog cat cat dog";
       WordPattern w = new WordPattern();
       System.out.println(w.wordPattern(pattern, s));
    }
}
