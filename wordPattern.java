
// Time Complexity:O(n), space complexity:O(1)
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> pmap = new HashMap<>();
        HashSet<String> smap = new HashSet<String>();

        for (int i = 0; i < pattern.length(); i++) {
            Character pChar = pattern.charAt(i);
            if (pmap.containsKey(pChar)) {
                if (!pmap.get(pChar).equals(words[i])) {
                    return false;
                }
            } else {
                if (smap.contains(words[i])) {
                    return false;
                } else {
                    pmap.put(pChar, words[i]);
                    smap.add(words[i]);
                }
            }
        }
        return true;
    }
}