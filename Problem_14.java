import java.util.HashMap;

class Solution {
    /*
     * Time Complexity - O(n) where n is the size of pattern
     * Space Complexity - O(m) where m is the number of unique strings in s
     */
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> stringMap = new HashMap<>();
        String[] strs = s.split(" ");
        if (strs.length != pattern.length()) return false;
        for (int i=0; i<strs.length; i++) {
            char c = pattern.charAt(i);
            String word = strs[i];
            if (charMap.containsKey(c)) {
                if (!charMap.get(c).equals(word))
                    return false;
            } 
            else {
                charMap.put(c, word);
            }
            if (stringMap.containsKey(word)) {
                if (stringMap.get(word) != c)
                    return false;
            } 
            else {
                stringMap.put(word, c);
            }
        }
        return true;
    }
}