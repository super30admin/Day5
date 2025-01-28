// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// Used hashmap to check 's' to 't' mapping and hashset to check 't' to 's' mapping

public class IsomorphicStringsWithSet {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) return false;
            } else {
                if (!tSet.add(tChar)) {
                    return false;
                } else {
                    sMap.put(sChar, tChar);
                }
            }
        }
        return true;
    }
}
