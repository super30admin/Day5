import java.util.HashMap;
import java.util.HashSet;

//time complexity is O(n)
//space complexity is O(52) or O(1);
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sValue = s.charAt(i);
            char tValue = t.charAt(i);

            if (sMap.containsKey(sValue)) {
                if (sMap.get(sValue) != tValue) {
                    return false;
                }
            } else {
                if (tSet.contains(tValue)) {
                    return false;
                }
                sMap.put(sValue, tValue);
                tSet.add(tValue);
            }
        }

        return true;

    }
}