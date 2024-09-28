
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> smap = new HashMap<Character, Character>();
        HashMap<Character, Character> tmap = new HashMap<Character, Character>();

        if (s.length() == t.length()) {

            for (int i = 0; i < s.length(); i++) {
                Character ss = s.charAt(i);
                Character tt = t.charAt(i);
                if (smap.containsKey(ss)) {
                    if (smap.get(ss) != tt) {
                        return false;
                    }
                } else {
                    smap.put(ss, tt);
                }

                if (tmap.containsKey(tt)) {
                    if (tmap.get(tt) != ss) {
                        return false;
                    }
                } else {
                    tmap.put(tt, ss);
                }

            }

            return true;
        } else {
            return false;
        }
    }
}
