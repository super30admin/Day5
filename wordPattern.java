class Solution {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split("\\s+");
        if (pattern.length() != words.length) return false;
        Map<String, Character> wordMap = new HashMap<>();
        Map<Character, String> patternMap = new HashMap<>();
        for(int i=0; i<pattern.length(); i++) {
            if(patternMap.containsKey(pattern.charAt(i))) {
                if (!patternMap.get(pattern.charAt(i)).equals(words[i]))
                    return false;
            } 
            if(wordMap.containsKey(words[i])) {
                if (!wordMap.get(words[i]).equals(pattern.charAt(i)))
                    return false;
            }
            
            patternMap.put(pattern.charAt(i), words[i]);
            wordMap.put(words[i], pattern.charAt(i));
        }
        return true;
    }
}