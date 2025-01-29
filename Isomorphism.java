import java.util.HashMap;

public class Isomorphism {
        public boolean isIsomorphic(String s, String t) {
            // Check if the strings have the same length
            if (s.length() != t.length()) {
                return false;
            }

            // Hash maps to store character mappings
            HashMap<Character, Character> sToTMap = new HashMap<>();
            HashMap<Character, Character> tToSMap = new HashMap<>();

            // Iterate over the characters of both strings
            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);

                // Check if the mapping from sChar to tChar is consistent
                if (sToTMap.containsKey(sChar)) {
                    if (sToTMap.get(sChar) != tChar) {
                        return false;
                    }
                } else {
                    sToTMap.put(sChar, tChar);
                }

                // Check if the mapping from tChar to sChar is consistent
                if (tToSMap.containsKey(tChar)) {
                    if (tToSMap.get(tChar) != sChar) {
                        return false;
                    }
                } else {
                    tToSMap.put(tChar, sChar);
                }
            }

            // If all checks pass, the strings are isomorphic
            return true;
        }

    }

