import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] patternChar = pattern.toCharArray();
        String[] sArray = s.split(" ");

        if (patternChar.length != sArray.length)
            return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < sArray.length; i++) {
            if (!map.containsKey(patternChar[i])) {
                if (!map.containsValue(sArray[i])) {
                    map.put(patternChar[i], sArray[i]);
                    continue;
                } else
                    return false;
            }
            if (!map.get(patternChar[i]).equals(sArray[i]))
                return false;
        }
        return true;

    }
}