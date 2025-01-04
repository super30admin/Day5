// TC: O(N*K)
// SC: O(N*K)
// where K is the average length of the mapping string
// where N is the length of the pattern


import java.util.*;

class LC290 {
    public boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");
        int m = pattern.length();
        int n = sArray.length;

        if (m != n)
            return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            char patternCh = pattern.charAt(i);
            String sStr = sArray[i];
            if (map.containsKey(patternCh)) {
                if (!map.get(patternCh).equals(sStr))
                    return false;
            } else {
                if (set.contains(sStr))
                    return false;
                map.put(patternCh, sStr);
                set.add(sStr);
            }
        }
        return true;
    }
}
