import java.util.HashMap;
import java.util.HashSet;

/**
 * TC: O(n) where n is length of s or t
 * SC: O(1) since s and t consist only ascii numbers and those are constants
 */
public class IsomorphicStrings {

        public boolean isIsomorphic(String s, String t) {

            if (s.length() != t.length()) {
                return false;
            }

            HashMap<Character, Character> sCharTCharMap = new HashMap();

            HashSet<Character> tCharSet = new HashSet();

            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);

                if (!sCharTCharMap.containsKey(sChar)) {

                    if (tCharSet.contains(tChar)) {
                        return false;
                    }
                    sCharTCharMap.put(sChar, tChar);
                    tCharSet.add(tChar);

                } else {
                    if (!sCharTCharMap.get(sChar).equals(tChar)) {
                        return false;
                    }
                }
            }
            return true;
        }
}
