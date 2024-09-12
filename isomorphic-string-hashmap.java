import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        // time complexity = O(n)
        // space complexity = O(26) or O(52) = O(1) = constant
        for (int i = 0; i < s.length(); i++) {
            // check in sMap
            char sValue = s.charAt(i);
            char tValue = t.charAt(i);

            if (sMap.containsKey(sValue)) {

                // now that the key is present in S map, we check of the value matches tValue.
                // if it does not, we return

                if (sMap.get(sValue) != tValue) {
                    return false;
                }
            } else {
                // value not in sMap so we add it
                sMap.put(sValue, tValue);
            }

            if (tMap.containsKey(tValue)) {

                if (tMap.get(tValue) != sValue) {
                    return false;
                }
            } else {
                tMap.put(tValue, sValue);
            }

        }
        return true;

    }
}