import java.util.HashMap;

/*
Time complexity -O(N)
Space COmplexity -O(1)
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (s == null || pattern == null || s.length() == 0 || pattern.length() == 0) {
            return false;
        }
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> hashMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (hashMap.containsKey(c)) {
                if (!hashMap.get(c).equals(word)) {
                    return false;
                }
            } else {
                if(hashMap.containsValue(word)) {
                    return false;
                }
                hashMap.put(c, word);
            }
        }
        return true;
    }
}