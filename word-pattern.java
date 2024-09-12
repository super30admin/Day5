// Time Compexity - O(N), N is the length of array with N words
// Space Complexity - O(M), M unique words in the array out of the N words, Characters are only 26 so constant space there.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        HashMap<Character, String> map1 = new HashMap<Character, String>();
        HashMap<String, Character> map2 = new HashMap<String, Character>();
  
        if (words.length != pattern.length())
            return false;
        for(int i=0;i<words.length;i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if(!map1.containsKey(ch)) {
                  if (map2.containsKey(word)) {
                    return false;
                } else {
                    map1.put(ch, word);
                    map2.put(word, ch);
                }
            }
            else {
                String mapped_word = map1.get(ch);
                if (!mapped_word.equals(word))
                    return false;
            }
        }
        
        
        return true;
        
    }
}
