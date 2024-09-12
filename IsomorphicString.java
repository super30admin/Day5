class Solution {
    // 2 hashmap to store mapping  of letters.
    // if the mapping exist and same then fine if not same return false
    // space: O(n)
    //time: 0(n)
    public boolean isIsomorphic(String s, String t) {
        //edge

        if (s.length() != t.length()) {
            return false;
        }
        // {e:a, g:d} | {a:e, d:g}
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                if (sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                sMap.put(s.charAt(i), t.charAt(i));
            }

            if (tMap.containsKey(t.charAt(i))) {
                if (tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                tMap.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
