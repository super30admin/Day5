/*
 * map the characters in both string present a the give index if this is the 1st mapping
 * else check if the string 1's mapping is correct
 *  also maintain a hashset with characters of 2nd string to check 1 to 1 mapping of string 2 to string1
 */
import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();
        int len = s.length();
        if (len != t.length()) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (smap.containsKey(s1) && smap.get(s1) != t1) {
                return false;
            }
            if (!smap.containsKey(s1) && tset.contains(t1)) {
                return false;
            }
            smap.put(s1, t1);
            tset.add(t1);

        }
        return true;

    }

}
