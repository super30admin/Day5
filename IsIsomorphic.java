import java.util.*;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> h1 = new HashMap<>();
        HashMap<Character, Character> h2 = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char sC = s.charAt(i);
            char tC = t.charAt(i);

            if (!h1.containsKey(sC)) {
                h1.put(sC, tC);
            }
            if (h1.get(sC) != tC) {
                return false;
            }
            if (!h2.containsKey(tC)) {
                h2.put(tC, sC);
            }
            if (h2.get(tC) != sC) {
                return false;
            }
        }
        return true;
    }
}
