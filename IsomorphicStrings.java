// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// Used two hashmaps to check unique mappings for s String to t String and vice versa

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            } else {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            }

            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, sChar);
            } else {
                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            }
        }
        return true;
    }
}
