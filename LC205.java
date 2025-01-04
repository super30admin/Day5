// TC: O(n)
// SC: O(1)

import java.util.*;

class LC205 {
    public boolean isIsomorphic(String s, String t) {
        int m = s.length(), n = t.length();

        if (m != n)
            return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if (map.containsKey(sch)) {
                if (map.get(sch) != tch)
                    return false;
            } else {
                if (set.contains(tch))
                    return false;
                map.put(sch, tch);
                set.add(tch);
            }
        }
        return true;
    }
}