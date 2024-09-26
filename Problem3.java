import java.util.HashMap;

//Time Complexity O(n)
//Space Complexity O(n)


public class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if (pattern.length() != strArray.length) return false;

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = strArray[i];
            if (pMap.containsKey(c)) {
                if (!pMap.get(c).equals(str)) {
                    return false;
                }
            } else {
                pMap.put(c, str);
            }
            if (sMap.containsKey(str)) {
                if (sMap.get(str) != c) {
                    return false;
                }
            } else {
                sMap.put(str, c);
            }
        }
        return true;

    }
}
