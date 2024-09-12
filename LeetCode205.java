import java.util.HashMap;

public class LeetCode205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // first approach using 2 hash maps:
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            // Decision for First Hash map:
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }

            // Decision for 2nd Hash map:
            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            } else {
                tMap.put(tChar, sChar);
            }

        }
        return true;
    }
}

// tC--> O(n);
// SC-->O(1)--->will be a constant value as we are going to store only upper and
// lower case alphabets and that will not be equal to 10^4
