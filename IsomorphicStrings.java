// TIME: O(1)
// SPACE: O(1)
// SUCCESS on LeetCode

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length()) return false;

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sMap.containsKey(c)) {
                if (sMap.get(c) != t.charAt(i)) {
                    return false;
                }
            } else {
                sMap.put(c, t.charAt(i));
            }
            
            c = t.charAt(i);
            
            if (tMap.containsKey(c)) {
                if (tMap.get(c) != s.charAt(i)) {
                    return false;
                }
            } else {
                tMap.put(c, s.charAt(i));
            }
        }

        return true;
    }
}
