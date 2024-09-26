//T: O(N) no. of words in string
//S: O(M) no of unique words
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> charMap = new HashMap();
        HashMap <String, Character> wordMap = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (!charMap.containsKey(c)) {
                if (wordMap.containsKey(w)) {
                    return false;
                } else {
                    charMap.put(c, w);
                    wordMap.put(w, c);
                }

            } else {
                String mappedWord = charMap.get(c);
                if (!mappedWord.equals(w))
                    return false;
            }
        }

        return true;
    }
}
