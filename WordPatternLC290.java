/*Time  complexity  O(n)
 * Space complexity O(n)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
*/
public class WordPatternLC290 {
    // Using 2 maps
    public static boolean wordPattern(String pattern, String s) {
        String[] parts = s.split(" ");
        if (pattern.length() != parts.length)
            return false;
        HashMap<String, String> pMap = new HashMap<>();
        HashMap<String, String> sMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String p = String.valueOf(pattern.charAt(i));
            String str = parts[i];
            if (pMap.containsKey(p)) {
                if (!pMap.get(p).equals(str))
                    return false;
            } else {
                pMap.put(p, str);
            }
            if (sMap.containsKey(str)) {
                if (!sMap.get(str).equals(p))
                    return false;
            } else {
                sMap.put( str,p);
            }

        }
        return true;

    }

    // Using 1map and hashset to store map values.
    public static boolean wordPattern1(String pattern, String s) {
        String[] parts = s.split(" ");
        if (pattern.length() != parts.length)
            return false;
        HashMap<String, String> pMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            String p = String.valueOf(pattern.charAt(i));
            String str = parts[i];
            if (pMap.containsKey(p)) {
                if (!pMap.get(p).equals(str))
                    return false;
            } else {
                if (set.contains(str))
                    return false;
                pMap.put(p, str);
                set.add(str);
            }

        }
        return true;

    }
}
