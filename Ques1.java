class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;

        Map<Character, Integer> charIndexMap = new HashMap<>();
        Map<String, Integer> wordIndexMap = new HashMap<>();

        for (int i = 0; i < words.length; ++i) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Using Integer to avoid unboxing issues and null values
            Integer charIndex = charIndexMap.put(c, i);
            Integer wordIndex = wordIndexMap.put(word, i);

            // Check if the current mapping is different from previous occurrences
            if (!Objects.equals(charIndex, wordIndex)) {// cant use other comparasion techies
                return false;
            }
        }

        return true;
    }
}