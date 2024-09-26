// TIME: O(n)
// SPACE: O(n)
// SUCCESS on LeetCode


public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();
        
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) {
            return false;
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (patternMap.containsKey(c)) {
                if (!patternMap.get(c).equals(strs[i])) {
                    return false;
                }
            } else {
                patternMap.put(c, strs[i]);
            }
            
            if (wordMap.containsKey(strs[i])) {
                if (wordMap.get(strs[i]) != c) {
                    return false;
                }
            } else {
                wordMap.put(strs[i], c);
            }
        }
        return true;
    }
}
