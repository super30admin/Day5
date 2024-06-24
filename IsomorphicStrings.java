import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!map1.containsKey(sChar[i])) {
                if (!map1.containsValue(tChar[i])) {
                    map1.put(sChar[i], tChar[i]);
                    continue;
                } else
                    return false;
            }
            if (!map1.get(sChar[i]).equals(tChar[i]))
                return false;

        }
        return true;

    }
}